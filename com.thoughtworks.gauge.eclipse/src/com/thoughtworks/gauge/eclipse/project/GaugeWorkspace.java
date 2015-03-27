package com.thoughtworks.gauge.eclipse.project;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.IProject;

import com.thoughtworks.gauge.GaugeConnection;
import com.thoughtworks.gauge.GaugeConstant;
import com.thoughtworks.gauge.eclipse.exception.GaugeNotFoundException;
import com.thoughtworks.gauge.eclipse.util.GaugeUtil;

public class GaugeWorkspace {

	private static HashMap<IProject, GaugeService> gaugeProjectHandles = new HashMap<IProject, GaugeService>();

	public static GaugeService getGaugeService(IProject project) {
		return gaugeProjectHandles.get(project);
	}

	public static void setGaugeService(IProject project, GaugeService service) {
		gaugeProjectHandles.put(project, service);
	}

	public static void createGaugeService(IProject project) {
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

	private static GaugeConnection initializeGaugeConnection(int port) {
		if (port != -1) {
			return new GaugeConnection(port);
		} else {
			return null;
		}
	}

}
