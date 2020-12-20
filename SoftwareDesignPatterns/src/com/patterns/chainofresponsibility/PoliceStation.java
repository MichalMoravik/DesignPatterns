package com.patterns.chainofresponsibility;

// CHAIN
public class PoliceStation {
	// a chain from police units
	PoliceUnit chain;

	public PoliceStation() {
		buildChain();
	}

	private void buildChain() {
		chain = new BombSquad(new TacticalUnit(new DEA(null)));
	}

	public void makeCase(Case policeCase) {
		chain.handleCase(policeCase);
	}
}


