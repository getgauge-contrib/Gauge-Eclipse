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

import com.thoughtworks.gauge.eclipse.exception.GaugeNotFoundException;
import com.thoughtworks.gauge.eclipse.util.GaugeUtil;

public class GaugeProjectCreator {

	private String projectName;

	public GaugeProjectCreator(String name) {
		this.projectName = name;
	}

	public void createProject() {
		IWorkspaceRoot root = root();
		try {
			IPath rootLocation = root.getLocation();
			GaugeUtil.initializeProject(rootLocation.toFile(), projectName);
			IJavaProject gaugeJavaProject = createJavaProject(root);
			GaugeWorkspace.createGaugeService(gaugeJavaProject.getProject());
			setupJavaProject(gaugeJavaProject);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (GaugeNotFoundException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private IJavaProject createJavaProject(IWorkspaceRoot root) throws CoreException {
		IProject project = root.getProject(projectName);
		project.create(null);
		project.open(null);
		project.refreshLocal(IResource.DEPTH_INFINITE, null);
		
		IProjectDescription desc = project.getDescription();
		desc.setNatureIds(new String[] { JavaCore.NATURE_ID });
		project.setDescription(desc, null);
		IJavaProject javaProject = JavaCore.create(project);
		return javaProject;
	}

	private void setupJavaProject(IJavaProject project)
			throws CoreException {
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
		
		javaProject.setRawClasspath(new IClasspathEntry[] {sourceEntry}, null);
		IFolder binDir = project.getFolder("bin");
		IPath binPath = binDir.getFullPath();
		javaProject.setOutputLocation(binPath, null);
		
	}

	private IWorkspaceRoot root() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

}
