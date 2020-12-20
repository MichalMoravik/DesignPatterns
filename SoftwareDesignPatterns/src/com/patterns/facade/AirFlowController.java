package com.patterns.facade;

public class AirFlowController {
	private AirFlowMeter airFlowMeter;

	public AirFlowController(AirFlowMeter airFlowMeter) {
		this.airFlowMeter = airFlowMeter;
	}

	public void takeAir() {
		System.out.println("Taking air inside!");
	}

	public void off() {
		System.out.println("Turning off the air flow!");
	}
}
