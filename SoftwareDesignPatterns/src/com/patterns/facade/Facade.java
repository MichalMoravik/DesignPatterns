package com.patterns.facade;

public class Facade {
	AirFlowMeter airFlowMeter;
	AirFlowController airFlowController;
	FuelPump fuelPump;
	FuelInjector fuelInjector;
	Starter starter;
	Radiator radiator;
	TemperatureSensor temperatureSensor;
	CatalyticConverter catalyticConverter;
	CoolingController coolingController;

	public Facade() {
		this.airFlowMeter = new AirFlowMeter(25);
		this.airFlowController = new AirFlowController(airFlowMeter);
		this.fuelPump = new FuelPump();
		this.fuelInjector = new FuelInjector(fuelPump);
		this.starter = new Starter();
		this.radiator = new Radiator(15);
		this.temperatureSensor = new TemperatureSensor(50);
		this.coolingController = new CoolingController(radiator, temperatureSensor);
		this.catalyticConverter = new CatalyticConverter();
	}

	public void startEngine() {
		this.airFlowController.takeAir();
		this.fuelInjector.on();
		this.fuelInjector.inject();
		this.starter.start();
		this.coolingController.setTemperatureUpperLimit();
		this.coolingController.run();
		this.catalyticConverter.on();
	}

	public void stopEngine() {
		this.fuelInjector.off();
		this.catalyticConverter.off();
		this.coolingController.setTemperatureUpperLimit();
		this.coolingController.stop();
		this.airFlowController.off();
	}
}
