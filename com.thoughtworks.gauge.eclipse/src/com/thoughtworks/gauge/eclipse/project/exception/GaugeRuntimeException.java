package com.thoughtworks.gauge.eclipse.project.exception;

public class GaugeRuntimeException extends Exception {

	private static final long serialVersionUID = 2335887226986237500L;
	private static final String MESSAGE = "Unable to establish a Gauge connection";

	public GaugeRuntimeException() {
		super(MESSAGE);
	}
}
