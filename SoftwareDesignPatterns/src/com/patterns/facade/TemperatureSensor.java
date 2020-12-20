package com.patterns.facade;

public class TemperatureSensor {
	private int temperature;

	public TemperatureSensor(int temperature) {
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}
}
