package com.patterns.visitor;

public class Client {
	public static void main(String[] args) {
		BombSquad bombSquad = new BombSquad();
		DEA dea = new DEA();

		bombSquad.attack();
		bombSquad.defend();
		dea.attack();
		dea.defend();

		System.out.println("--- after 2 months of training ---");
		// so both teams came to the FBI academy two months ago
		// and they both acquired a new skills
		cameToFBIAcademy(bombSquad, dea);
	}

	private static void cameToFBIAcademy(IPoliceUnit... policeUnits) {
		IPoliceTraining policeTraining = new FBIPoliceAcademy();
		for (IPoliceUnit unit :policeUnits) {
			unit.accept(policeTraining);
		}
	}
}


