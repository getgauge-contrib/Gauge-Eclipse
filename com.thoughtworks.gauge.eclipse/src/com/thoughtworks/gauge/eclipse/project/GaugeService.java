package com.thoughtworks.gauge.eclipse.project;

import com.thoughtworks.gauge.GaugeConnection;

public class GaugeService {

	private Process process;
	private GaugeConnection gaugeConnection;

	public GaugeService(Process gaugeProcess, GaugeConnection gaugeConnection) {
		this.process = gaugeProcess;
		this.gaugeConnection = gaugeConnection;
	}

	public GaugeConnection getGaugeConnection() {
		return this.gaugeConnection;
	}

}
