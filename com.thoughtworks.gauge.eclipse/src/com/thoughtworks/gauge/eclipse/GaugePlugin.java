package com.thoughtworks.gauge.eclipse;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.thoughtworks.gauge.eclipse.project.GaugeWorkspace;

/**
 * The activator class controls the plug-in life cycle
 */
public class GaugePlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.thoughtworks.gauge.eclipse"; //$NON-NLS-1$

	// The shared instance
	private static GaugePlugin plugin;

	private boolean initialized = false;

	private GaugeWorkspace workspace;
	
	/**
	 * The constructor
	 */
	public GaugePlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		initializeProjects();
	}

	private void initializeProjects() {
		if (!this.initialized) {
			getGaugeWorkspace().createGaugeServicesForProjects();
			this.initialized = true;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		getGaugeWorkspace().killAllGaugeServices();
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static GaugePlugin getDefault() {
		return plugin;
	}
	
	public GaugeWorkspace getGaugeWorkspace() {
		if (this.workspace == null) {
			this.workspace = new GaugeWorkspace();
		}
		return this.workspace;
	}

}
