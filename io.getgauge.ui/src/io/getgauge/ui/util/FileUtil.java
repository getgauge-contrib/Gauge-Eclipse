package io.getgauge.ui.util;

import java.io.File;

public class FileUtil {

	public static boolean createDirectory(File workingDir) {
		boolean exists = true;
		if (!workingDir.exists()) {
			exists = workingDir.mkdirs();
		}
		return exists;
	}

}
