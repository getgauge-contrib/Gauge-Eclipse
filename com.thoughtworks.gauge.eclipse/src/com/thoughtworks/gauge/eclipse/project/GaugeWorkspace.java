package com.thoughtworks.gauge.eclipse.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.thoughtworks.gauge.ConceptInfo;
import com.thoughtworks.gauge.GaugeConnection;
import com.thoughtworks.gauge.StepValue;
import com.thoughtworks.gauge.eclipse.GaugePlugin;
import com.thoughtworks.gauge.eclipse.service.GaugeService;
import com.thoughtworks.gauge.eclipse.util.GaugeUtil;

public class GaugeWorkspace {

	private HashMap<IProject, GaugeService> gaugeProjectHandles = new HashMap<IProject, GaugeService>();

	public GaugeService getGaugeService(IProject project) {
		return gaugeProjectHandles.get(project);
	}

	public void setGaugeService(IProject project, GaugeService service) {
		gaugeProjectHandles.put(project, service);
	}

	public void createGaugeService(IProject project) {
		int port = GaugeUtil.findFreePortForApi();
		Process gaugeProcess;
		gaugeProcess = GaugeUtil.initializeGaugeProcess(project.getLocation().toFile(), port);
		GaugeConnection gaugeConnection = initializeGaugeConnection(port);
		if (gaugeConnection != null) {
			gaugeProjectHandles.put(project, new GaugeService(gaugeProcess, gaugeConnection));
		} else if (gaugeProcess != null) {
			gaugeProcess.destroy();
		}
	}

	private  GaugeConnection initializeGaugeConnection(int port) {
		if (port != -1) {
			return new GaugeConnection(port);
		} else {
			return null;
		}
	}

	public List<IProject> getGaugeProjects() {
		ArrayList<IProject> gaugeProjects = new ArrayList<IProject>();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : projects) {
			if (isGaugeProject(project)) {
				gaugeProjects.add(project);
			}
		}
		return gaugeProjects;
	}

	public boolean isGaugeProject(IProject project) {
		boolean isGaugeProject = false;
		try {
			isGaugeProject = project.hasNature(GaugeProjectNature.NATURE_ID);
		} catch (CoreException e) {
			return isGaugeProject;
		}
		return isGaugeProject;
	}

	public void killAllGaugeServices() {
		for (Entry<IProject, GaugeService> entry : gaugeProjectHandles.entrySet()) {
			entry.getValue().kill();
		}
	}

	public void createGaugeServicesForProjects() {
		for (IProject project : getGaugeProjects()) {
			createGaugeService(project);
		}
	}

    public List<String> getSteps(IProject project) {
        List<String> steps = new ArrayList<String>();
        try {
        	GaugeWorkspace workbench = GaugePlugin.getDefault().getGaugeWorkspace();
        	
            GaugeService gaugeService = workbench.getGaugeService(project);
            if (gaugeService == null)
                return steps;
            GaugeConnection gaugeConnection = gaugeService.getGaugeConnection();
            if (gaugeConnection != null) {
                List<StepValue> stepValues = gaugeConnection.fetchAllSteps();
                for (StepValue stepValue : stepValues) {
                    steps.add(stepValue.getStepAnnotationText());
                }
                for (ConceptInfo conceptInfo : gaugeConnection.fetchAllConcepts()) {
                    steps.add(conceptInfo.getStepValue().getStepAnnotationText());
                }
                return steps;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return steps;
    }
	
}
