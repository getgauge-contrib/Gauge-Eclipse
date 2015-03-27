package com.thoughtworks.gauge.eclipse.service;

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

	public void kill() {
		try {
			if (process != null) {
				process.destroy();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
