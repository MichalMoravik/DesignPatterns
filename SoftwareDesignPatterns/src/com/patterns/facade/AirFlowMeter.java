package com.patterns.facade;

public class AirFlowMeter {
	private int measurements;

	public AirFlowMeter(int measurements) {
		this.measurements = measurements;
	}

	public int getMeasurements() {
		return measurements;
	}
}
