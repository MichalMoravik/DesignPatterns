package com.patterns.visitor;

public class DEA implements IPoliceUnit {
	@Override
	public void attack() {
		System.out.println("DEA attacks!");
	}

	@Override
	public void defend() {
		System.out.println("DEA defends!");
	}

	@Override
	public void accept(IPoliceTraining policeTraining) {
		policeTraining.visitDEA(this);
	}
}

