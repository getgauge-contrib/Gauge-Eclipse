package io.getgauge;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;

public class ProjectUtil {
	public static IProject getProject(EObject eobj){
		String platformString = eobj.eResource().getURI().toPlatformString(true);
		IFile currentFile = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(platformString));
		return currentFile.getProject();
	}
}
