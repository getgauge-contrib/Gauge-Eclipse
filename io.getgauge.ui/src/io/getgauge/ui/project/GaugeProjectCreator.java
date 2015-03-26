package io.getgauge.ui.project;

import java.io.IOException;

import io.getgauge.ui.exceptions.GaugeNotFoundException;
import io.getgauge.ui.util.GaugeUtil;

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

public class GaugeProjectCreator {

	private String projectName;

	public GaugeProjectCreator(String name) {
		this.projectName = name;
	}

	public void createProject() {
		IWorkspaceRoot root = root();
		try {
			IPath rootLocation = root.getLocation();
			GaugeUtil.createProject(rootLocation.toFile(), projectName);
			
			IProject project = root.getProject(projectName);
			project.create(null);
			project.open(null);
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
						
			setupJavaProject(rootLocation, project);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GaugeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setupJavaProject(IPath rootLocation, IProject project)
			throws CoreException {
		IProjectDescription desc = project.getDescription();
		desc.setNatureIds(new String[] { JavaCore.NATURE_ID });
		project.setDescription(desc, null);
			
		IJavaProject javaProject = JavaCore.create(project);
		IPath srcPath = project.getFolder("src").getFullPath().append("test").append("java");
		IPath libsPath = project.getFolder("libs").getLocation();
		IClasspathEntry sourceEntry = JavaCore.newSourceEntry(srcPath);
		IClasspathEntry libraryEntry = JavaCore.newLibraryEntry(libsPath, null, null);
		
		javaProject.setRawClasspath(new IClasspathEntry[] {sourceEntry,  libraryEntry}, null);
		IFolder binDir = project.getFolder("bin");
		IPath binPath = binDir.getFullPath();
		javaProject.setOutputLocation(binPath, null);
	}

	private IWorkspaceRoot root() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

}
