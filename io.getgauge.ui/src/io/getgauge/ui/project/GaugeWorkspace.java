package io.getgauge.ui.project;

import io.getgauge.ui.exceptions.GaugeNotFoundException;
import io.getgauge.ui.util.GaugeUtil;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.core.resources.IProject;

import com.thoughtworks.gauge.GaugeConnection;
import com.thoughtworks.gauge.GaugeConstant;

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
		gaugeProcess = initializeGaugeProcess(project.getLocation().toFile(), port);
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

	private static Process initializeGaugeProcess(File workingDir, int port) {
		try {
			String path = GaugeUtil.getGaugeExecPath();
			ProcessBuilder gauge = new ProcessBuilder(path, GaugeConstant.DAEMONIZE_FLAG);
			gauge.environment().put(GaugeConstant.GAUGE_API_PORT, String.valueOf(port));
			gauge.directory(workingDir);
			return gauge.start();
		} catch (IOException e) {
			System.err.println("could not start gauge api:" + e.getMessage());
		} catch (GaugeNotFoundException e) {
			System.err.println("Could not start gauge api:" + e.getMessage());
		}
		return null;
	}

}
