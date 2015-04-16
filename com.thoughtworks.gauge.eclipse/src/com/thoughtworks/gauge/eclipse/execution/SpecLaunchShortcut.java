package com.thoughtworks.gauge.eclipse.execution;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.statushandlers.StatusManager;

import com.thoughtworks.gauge.eclipse.util.GaugeUtil;

public class SpecLaunchShortcut implements ILaunchShortcut {

	public void launch(ISelection selection, String mode) {
		Object element = ((IStructuredSelection) selection).getFirstElement();
		if (element instanceof IFile | element instanceof IFolder) {
			try {
				runSpecs((IResource) element, mode);
			} catch (CoreException e) {
				GaugeUtil.displayErrorMessage("Unable to run specs",
						StatusManager.LOG, e);
			}
		} else {
			GaugeUtil.displayWarningMessage(
					"Cannot run specs for the selection.", StatusManager.LOG,
					null);
		}
	}

	public void launch(IEditorPart editor, String mode) {
		try {
			IEditorInput editorInput = editor.getEditorInput();
			if (editorInput instanceof IFileEditorInput) {
				IFile file = ((IFileEditorInput) editorInput).getFile();
				runSpecs(file, mode);
			} else {
				GaugeUtil.displayWarningMessage(
						"Cannot run specs for the selection.",
						StatusManager.LOG, null);
			}
		} catch (CoreException e) {
			GaugeUtil.displayErrorMessage("Unable to run specs",
					StatusManager.LOG, e);
		}
	}

	private void runSpecs(IResource file, String mode) throws CoreException {
		String path = file.getFullPath().toString();
		ILaunchManager launchManager = DebugPlugin.getDefault()
				.getLaunchManager();
		ILaunchConfigurationType type = launchManager
				.getLaunchConfigurationType(Constants.LAUNCH_CONFIGURATION_TYPE_ID);
		ILaunchConfiguration configuration = createLaunchConfiguration(type,
				path, file);
		DebugUITools.launch(configuration, mode);
	}

	private ILaunchConfiguration createLaunchConfiguration(
			ILaunchConfigurationType type, String path, IResource file)
			throws CoreException {
		String configname = file.getProjectRelativePath().toOSString()
				.replace(Path.SEPARATOR, '-');
		if (configname.startsWith("-")) {
			configname = configname.substring(1);
		}

		ILaunchConfiguration[] configs = DebugPlugin.getDefault()
				.getLaunchManager().getLaunchConfigurations(type);
		for (ILaunchConfiguration config : configs) {
			if (configname.equals(config.getName())) {
				return config;
			}
		}

		// Is there a better way to get working directory?
		// Path gives me /project/specs/specfile.spec . This is not proper
		// filesystem path.
		IPath workSpace = file.getProject().getWorkspace().getRoot()
				.getLocation();
		IPath projectPath = file.getProject().getFullPath();
		String workingDir = workSpace.append(projectPath).toOSString();
		ILaunchConfigurationWorkingCopy workingCopy = type.newInstance(null,
				configname);

		// Again, the path parameter holds incorrect path (probably EFS path),
		// not the actual file system path.
		workingCopy.setAttribute(Constants.SPECS_TO_EXECUTE, file
				.getProjectRelativePath().toOSString());
		workingCopy.setAttribute(Constants.WORKING_DIRECTORY, workingDir);
		return workingCopy.doSave();
	}
}
