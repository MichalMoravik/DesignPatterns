package com.patterns.visitor;

public class FBIPoliceAcademy implements IPoliceTraining {
	@Override
	public void visitDEA(DEA dea) {
		// if DEA visits FBI academy to learn more about their profession,
		// they acquire a new skill - heavy weapon shooting
		System.out.println("I got a new skill - I can shoot from a heavy weapon!");
	}

	@Override
	public void visitBombSquad(BombSquad bombSquad) {
		// if Bomb squad visits FBI academy to learn more about their profession,
		// they acquire a new skill - how to deal with a land mine
		System.out.println("I got a new skill - I can deal with a land mine!");
	}
}

