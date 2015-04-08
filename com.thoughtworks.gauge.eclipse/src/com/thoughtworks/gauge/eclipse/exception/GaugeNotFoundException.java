package com.thoughtworks.gauge.eclipse.exception;

public class GaugeNotFoundException extends Exception {
	private static final long serialVersionUID = 2483026363531195430L;
	
	public static String GAUGE_INSTALL_MESSAGE = "Make sure Gauge is installed and available in Path";

	public GaugeNotFoundException(String message) {
        super(message);
    }
}
