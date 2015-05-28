package com.thoughtworks.gauge.eclipse.util;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;

import com.thoughtworks.gauge.GaugeConstant;
import com.thoughtworks.gauge.eclipse.GaugePlugin;
import com.thoughtworks.gauge.eclipse.exception.GaugeNotFoundException;

public class GaugeUtil {
	private static String gaugePath = null;

	public static String getGaugeExecPath() throws GaugeNotFoundException {
		if (gaugePath == null) {
			gaugePath = getPath();
		}
		return gaugePath;
	}

	private static String getPath() throws GaugeNotFoundException {
		String path = System.getenv("PATH");
		String gaugeHome = System.getenv("GAUGE_ROOT");
		if (gaugeHome != null && !gaugeHome.isEmpty()) {
			File bin = new File(gaugeHome, "bin");
			File gaugeExec = new File(bin, gaugeExecutable());
			if (gaugeExec.exists()) {
				return gaugeExec.getAbsolutePath();
			}
		} else if (path != null && !path.isEmpty()) {
			for (String entry : path.split(File.pathSeparator)) {
				File gaugeExec = new File(entry, gaugeExecutable());
				if (gaugeExec.exists()) {
					return gaugeExec.getAbsolutePath();
				}
			}
		}
		throw new GaugeNotFoundException(
				"Could not find executable in PATH or GAUGE_ROOT. Gauge is not installed.");
	}

	private static String gaugeExecutable() {
		if (isWindows()) {
			return "gauge" + ".exe";
		} else {
			return "gauge";
		}

	}

	private static boolean isWindows() {
		return (System.getProperty("os.name").toLowerCase().contains("win"));
	}

	public static void initializeProject(File projectDir)
			throws IOException, GaugeNotFoundException {
		if (!FileUtil.createDirectory(projectDir)) {
			throw new IOException(String.format(
					"Unable to create project directory %s",
					projectDir.getAbsolutePath()));
		}
		try {
			initializeUsingGauge(projectDir);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void initializeUsingGauge(File projectDir)
			throws GaugeNotFoundException, IOException, InterruptedException {
		ProcessBuilder builder = new ProcessBuilder(getGaugeExecPath(),
				"--init", "java");
		builder.directory(projectDir);
		Process p = builder.start();
		p.waitFor();
		if (p.exitValue() != 0) {
			throw new RuntimeException("Gauge Project initialization failed");
		}
	}
	
	public static Process initializeGaugeProcess(File workingDir, int port) {
		try {
			String path = GaugeUtil.getGaugeExecPath();
			ProcessBuilder gauge = new ProcessBuilder(path, GaugeConstant.DAEMONIZE_FLAG);
			gauge.environment().put(GaugeConstant.GAUGE_API_PORT, String.valueOf(port));
			gauge.directory(workingDir);
			return gauge.start();
		} catch (IOException e) {
			System.err.println("could not start gauge api:" + e.getMessage());
		} catch (GaugeNotFoundException e) {
			handleGaugeNotFoundException(e, "Could not start Gauge API");
		}
		return null;
	}


	public static int findFreePortForApi() {
		ServerSocket socket = null;
		try {
			socket = new ServerSocket(0);
			return socket.getLocalPort();
		} catch (IOException e) {

		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}
		return -1;
	}

	public static void handleGaugeNotFoundException(GaugeNotFoundException e, String message) {
		String errMessage = GaugeNotFoundException.GAUGE_INSTALL_MESSAGE;
		if (message!=null){
			errMessage=errMessage + " : " + message;
		}
		
		displayErrorMessage(errMessage, StatusManager.BLOCK, e);
	}
	
	public static void displayErrorMessage(String message, int level, Exception e) {
		Status status = new Status(IStatus.ERROR, GaugePlugin.PLUGIN_ID, 
				message, e);
		StatusManager.getManager().handle(status, level);
	}
	
	public static void displayWarningMessage(String message, int level, Exception e) {
		Status status = new Status(IStatus.WARNING, GaugePlugin.PLUGIN_ID, 
				message, e);
		StatusManager.getManager().handle(status, level);
	}

}
