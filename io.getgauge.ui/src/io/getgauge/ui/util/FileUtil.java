package io.getgauge.ui.util;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FilenameUtils;

public class FileUtil {

	public static boolean createDirectory(File workingDir) {
		boolean exists = true;
		if (!workingDir.exists()) {
			exists = workingDir.mkdirs();
		}
		return exists;
	}

	/**
	 * Returns all files in the directory dir with the given extension. Does not
	 * search recursively.
	 * 
	 * @param dir
	 *            - Directory to search for files
	 * @param extension
	 *            - file extension to search, eg: jar. No '.' required 
	 * @return
	 */
	public static List<File> findFilesByExtension(File dir, String extension) {
		if (!dir.isDirectory() || !dir.exists()) {
			return new ArrayList<File>();
		}
		File[] filteredFiles = dir.listFiles(new FileUtil().new FileExtensionFilter(extension));
		return Arrays.asList(filteredFiles);
	}

	private class FileExtensionFilter implements FileFilter {

		private String extension;

		public FileExtensionFilter(String extension) {
			this.extension = extension;
		}

		public boolean accept(File pathname) {
			return FilenameUtils.getExtension(pathname.getAbsolutePath()).equals(extension);
		}

	}

}
