package com.patterns.facade;

public class CoolingController {
	private Radiator radiator;
	private TemperatureSensor temperatureSensor;

	public CoolingController(Radiator radiator, TemperatureSensor temperatureSensor) {
		this.radiator = radiator;
		this.temperatureSensor = temperatureSensor;
	}

	public void setTemperatureUpperLimit() {
		System.out.println("Setting temperature upper limit!");
	}

	public void run() {
		System.out.println("Running cooling controller!");
	}

	public void cool() {
		System.out.println("Cooling controller started cooling!");
	}

	public void stop() {
		System.out.println("Turning off the cooling controller!");
	}
}
