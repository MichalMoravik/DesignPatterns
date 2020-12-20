package com.patterns.facade;

public class FuelInjector {
	private FuelPump fuelPump;

	public FuelInjector(FuelPump fuelPump) {
		this.fuelPump = fuelPump;
	}

	public void on() {
		System.out.println("Fuel injector ON!");
	}

	public void off() {
		System.out.println("Fuel injector OFF!");
	}

	public void inject() {
		System.out.println("Fuel injector injects!");
	}
}
