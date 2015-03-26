package io.getgauge.ui.exceptions;

public class GaugeNotFoundException extends Exception {
	private static final long serialVersionUID = 2483026363531195430L;

	public GaugeNotFoundException(String message) {
        super(message);
    }
}
