package com.patterns.visitor;

public class BombSquad implements IPoliceUnit {
	@Override
	public void attack() {
		System.out.println("Bomb squad attacks!");
	}

	@Override
	public void defend() {
		System.out.println("Bomb squad defends");
	}

	@Override
	public void accept(IPoliceTraining policeTraining) {
		policeTraining.visitBombSquad(this);
	}
}


