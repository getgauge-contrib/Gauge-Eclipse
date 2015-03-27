package io.getgauge.ui.project;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;

public class GaugeJavaClasspathContainer implements IClasspathContainer {

	private IClasspathEntry[] fEntries;
	public static final IPath GAUGE_JAVA_LIB_PATH = new Path("com.thoughtworks.gauge.java.container");
	
	public GaugeJavaClasspathContainer(IClasspathEntry[] entries) {
		fEntries = entries;
	}

	public IClasspathEntry[] getClasspathEntries() {
		return fEntries;
	}

	public String getDescription() {
		return "Gauge Java Lib";
	}

	public int getKind() {
		return IClasspathContainer.K_APPLICATION;
	}

	public IPath getPath() {
		return GAUGE_JAVA_LIB_PATH;
	}

}
