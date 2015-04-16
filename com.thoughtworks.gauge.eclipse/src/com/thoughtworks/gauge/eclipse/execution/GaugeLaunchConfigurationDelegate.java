package com.thoughtworks.gauge.eclipse.execution;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.ui.statushandlers.StatusManager;

import com.thoughtworks.gauge.eclipse.exception.GaugeNotFoundException;
import com.thoughtworks.gauge.eclipse.util.GaugeUtil;

public class GaugeLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		try {
			GaugeUtil.getGaugeExecPath(); // Throws GaugeNotFoundException when Gauge is not installed
			String workingDirVal = configuration.getAttribute(Constants.WORKING_DIRECTORY, "");
			File workingDirectory = new File(workingDirVal);
			if(workingDirVal=="" || !workingDirectory.exists()) {
				GaugeUtil.displayErrorMessage("Working directory is not set or is invalid in this run configuration", StatusManager.LOG, null);
				return;
			}
			String specsToExecute = configuration.getAttribute(Constants.SPECS_TO_EXECUTE, Constants.SPECS_TO_EXECUTE_DEFAULT);
			if(specsToExecute.trim()=="") {
				GaugeUtil.displayErrorMessage("No specs specified for execution.", StatusManager.LOG, null);
				return;
			}
			String environment = configuration.getAttribute(Constants.ENVIRONMENT, Constants.ENVIRONMENT_DEFAULT);
			String tags = configuration.getAttribute(Constants.TAG_EXPRESSION, Constants.TAG_EXPRESSION_DEFAULT);
			boolean parallelEnabled = configuration.getAttribute(Constants.PARALLEL_ENABLED, Constants.PARALLEL_ENABLED_DEFAULT);
			String parallelNumber = configuration.getAttribute(Constants.PARALLEL_NUMBER, Constants.PARALLEL_NUMBER_DEFAULT);
			
			ArrayList<String> cmdLine = new ArrayList<String>();
			cmdLine.add("gauge");
			cmdLine.add("--simple-console");
			if(tags.trim()!=Constants.TAG_EXPRESSION_DEFAULT) {
				cmdLine.add("--tags");
				cmdLine.add("'" + tags + "'");
			}
			
			if(parallelEnabled) {
				if(parallelNumber==Constants.PARALLEL_NUMBER_DEFAULT) {
					GaugeUtil.displayWarningMessage("Skipping parallel run, number of parallel streams not specified.", StatusManager.LOG, null);
				} else {
					cmdLine.add("--n");
					cmdLine.add(parallelNumber);
				}
			}
			
			if(environment.trim() != Constants.ENVIRONMENT_DEFAULT) {
				cmdLine.add("--env");
				cmdLine.add(environment);
			}
			
			cmdLine.add(specsToExecute);
			
			String[] commandLine = (String[]) cmdLine.toArray(new String[cmdLine.size()]);

			String[] envp=DebugPlugin.getDefault().getLaunchManager().getEnvironment(configuration);
			if (envp==null) {
				Map<String, String> stringVars = DebugPlugin.getDefault().getLaunchManager().getNativeEnvironment();
				int idx=0;
				envp= new String[stringVars.size()];
				for (Iterator<String> i = stringVars.keySet().iterator(); i.hasNext();) {
					String key = i.next();
					String value = stringVars.get(key);
					envp[idx++]=key+"="+value;
				}
			}
			
			Process process = DebugPlugin.exec(commandLine, workingDirectory, envp);
			DebugPlugin.newProcess(launch, process, "gauge");			
			
		} catch (GaugeNotFoundException e) {
			// TODO Auto-generated catch block
			GaugeUtil.handleGaugeNotFoundException(e, null);
		}
	}
}
