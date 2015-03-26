package io.getgauge.ui.util;

import io.getgauge.ui.exceptions.GaugeNotFoundException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

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
//        LOG.info("PATH => " + path);
        String gaugeHome = System.getenv("GAUGE_ROOT");
//        LOG.info("GAUGE_ROOT => " + gaugeHome);
        if (gaugeHome != null && !gaugeHome.isEmpty()) {
            File bin = new File(gaugeHome, "bin");
            File gaugeExec = new File(bin, gaugeExecutable());
            if (gaugeExec.exists()) {
//                LOG.info("executable path: " + gaugeExec.getAbsolutePath());
                return gaugeExec.getAbsolutePath();
            }
        } else if (path!=null && !path.isEmpty()) {
            for (String entry : path.split(File.pathSeparator)) {
                File gaugeExec = new File(entry, gaugeExecutable());
                if (gaugeExec.exists()) {
//                    LOG.info("executable path: " + gaugeExec.getAbsolutePath());
                    return gaugeExec.getAbsolutePath();
                }
            }
        }
//        LOG.warn("Could not find executable in PATH or GAUGE_ROOT");
        throw new GaugeNotFoundException("Could not find executable in PATH or GAUGE_ROOT. Gauge is not installed.");
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

	public static void createProject(File root, String name) throws IOException, GaugeNotFoundException {
		File projectDir = new File(root, name);
		if (!FileUtil.createDirectory(projectDir)) {
			throw new IOException(String.format("Unable to create project directory %s", projectDir.getAbsolutePath()));
		}
		try {
			initializeUsingGauge(projectDir);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	private static void initializeUsingGauge(File projectDir) throws GaugeNotFoundException, IOException, InterruptedException {
		ProcessBuilder builder = new ProcessBuilder(getGaugeExecPath(), "--init", "java");
		builder.directory(projectDir);
		Process p = builder.start();
		p.waitFor();
	    if (p.exitValue() != 0) {
	    	throw new RuntimeException("Gauge Project initialization failed");
	    }
	}
}
