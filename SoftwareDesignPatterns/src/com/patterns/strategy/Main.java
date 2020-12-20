package com.patterns.strategy;

public class Main {
	public static void main(String[] args) {
		IVehicle taxicab = new Taxicab();
		IVehicle personalVehicle = new PersonalVehicle();
		IVehicle hotelShuttleBus = new HotelShuttleBus();

		// default one - creating a new Traveling object
		Traveling traveling = new Traveling(personalVehicle);
		traveling.travel();

		// change of the vehicle, but still calling travel() method
		traveling.changeVehicle(taxicab);
		traveling.travel();
		traveling.changeVehicle(hotelShuttleBus);
		traveling.travel();
	}
}
