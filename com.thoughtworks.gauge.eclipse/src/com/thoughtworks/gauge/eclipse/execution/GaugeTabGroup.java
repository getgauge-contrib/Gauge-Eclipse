package com.thoughtworks.gauge.eclipse.execution;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.EnvironmentTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.WorkingDirectoryBlock;

public class GaugeTabGroup extends AbstractLaunchConfigurationTabGroup {

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		// TODO Auto-generated method stub
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new GaugeParametersTab(),
				new WorkingDirectoryBlock(Constants.WORKING_DIRECTORY) {
					
					@Override
					protected IProject getProject(ILaunchConfiguration configuration)
							throws CoreException {
						// TODO Auto-generated method stub
						return null;
					}
				},
				new EnvironmentTab(),
				new CommonTab()
		};
		setTabs(tabs);		
	}
}
