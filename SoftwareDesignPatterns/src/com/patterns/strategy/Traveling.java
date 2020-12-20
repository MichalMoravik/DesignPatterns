package com.patterns.strategy;

public class Traveling {
	private IVehicle vehicle;

	public Traveling(IVehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void changeVehicle(IVehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void travel() {
		vehicle.transport();
	}
}


