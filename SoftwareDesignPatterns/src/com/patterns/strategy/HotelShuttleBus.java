package com.patterns.strategy;

public class HotelShuttleBus implements IVehicle {

	@Override
	public void transport() {
		System.out.println("Transporting using hotel shuttle bus");
	}
}

