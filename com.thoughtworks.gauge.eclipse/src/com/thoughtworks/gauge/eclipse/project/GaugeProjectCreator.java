package com.thoughtworks.gauge.eclipse.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.PreferenceConstants;
import org.eclipse.xtext.ui.XtextProjectHelper;

import com.thoughtworks.gauge.eclipse.GaugePlugin;
import com.thoughtworks.gauge.eclipse.exception.GaugeNotFoundException;
import com.thoughtworks.gauge.eclipse.util.GaugeProjectUtil;
import com.thoughtworks.gauge.eclipse.util.GaugeUtil;

public class GaugeProjectCreator {

	private static final String DOT_PROJECT = ".project";
	private String projectName;
	private IPath projectPath;

	public GaugeProjectCreator(String name, IPath projectPath) {
		this.projectName = name;
		this.projectPath = projectPath;
	}

	public void createProject() {
		try {
			GaugeUtil.initializeProject(projectPath.toFile());
			createAndSetupJavaProject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (GaugeNotFoundException e) {
			GaugeUtil.handleGaugeNotFoundException(e, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void createAndSetupJavaProject() throws CoreException {
		IJavaProject gaugeJavaProject = createGaugeJavaProject();
		startService(gaugeJavaProject.getProject());
		setupJavaProject(gaugeJavaProject);
	}

	private void startService(IProject project) {
		GaugePlugin.getDefault().getGaugeWorkspace().createGaugeService(project);
	}

	public void addProjectToWorkspace() {
		try {
			if (hasProjectDescription()) {
				onlyAddToWorkspace();
			} else {
				createAndSetupJavaProject();
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void onlyAddToWorkspace() {
		try {
			IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(projectPath.append(DOT_PROJECT));
			description.setNatureIds(natureIds());
			description.setLocation(projectPath);

			IProject project = GaugeProjectUtil.workspaceRoot().getProject(projectName);
			project.create(description, null);
			GaugePlugin.getDefault().getGaugeWorkspace().createGaugeService(project);

			project.open(null);
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private boolean hasProjectDescription() {
		return projectPath.append(DOT_PROJECT).toFile().exists();
	}

	private IJavaProject createGaugeJavaProject() throws CoreException {
		IWorkspaceRoot root = GaugeProjectUtil.workspaceRoot();
		IProjectDescription description = root.getWorkspace().newProjectDescription(projectName);
		description.setLocation(projectPath);
		description.setNatureIds(natureIds());

		IProject project = root.getProject(projectName);
		project.create(description, null);
		project.open(null);
		project.refreshLocal(IResource.DEPTH_INFINITE, null);

		IJavaProject javaProject = JavaCore.create(project);
		return javaProject;
	}

	private String[] natureIds() {
		return new String[] { JavaCore.NATURE_ID, GaugeProjectNature.NATURE_ID, XtextProjectHelper.NATURE_ID };
	}

	private void setupJavaProject(IJavaProject project) throws CoreException {
		markSrcAndOutputDirectory(project);
		addGaugeJavaDependencies(project);
	}

	private void addGaugeJavaDependencies(IJavaProject javaProject) {
		try {
			IClasspathEntry[] rawClasspath = javaProject.getRawClasspath();
			ArrayList<IClasspathEntry> classpath = new ArrayList<IClasspathEntry>(Arrays.asList(rawClasspath));
			classpath.add(JavaCore.newContainerEntry(GaugeJavaClasspathContainer.GAUGE_JAVA_LIB_PATH));
			classpath.addAll(Arrays.asList(PreferenceConstants.getDefaultJRELibrary()));
			javaProject.setRawClasspath(classpath.toArray(new IClasspathEntry[] {}), null);
			javaProject.save(null, true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private void markSrcAndOutputDirectory(IJavaProject javaProject) throws JavaModelException {
		IProject project = javaProject.getProject();
		IPath srcPath = project.getFolder("src").getFullPath().append("test").append("java");
		IClasspathEntry sourceEntry = JavaCore.newSourceEntry(srcPath);

		javaProject.setRawClasspath(new IClasspathEntry[] { sourceEntry }, null);
		IFolder binDir = project.getFolder("bin");
		IPath binPath = binDir.getFullPath();
		javaProject.setOutputLocation(binPath, null);
	}

}
