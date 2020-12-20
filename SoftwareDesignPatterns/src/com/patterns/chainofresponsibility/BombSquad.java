package com.patterns.chainofresponsibility;

public class BombSquad extends PoliceUnit {

	public BombSquad(PoliceUnit nextPoliceUnit) {
		super(nextPoliceUnit);
	}

	@Override
	public void handleCase(Case policeCase) {
		if (policeCase.getCaseType().equals(CaseType.BOMB)) {
			printHandling(policeCase);
		} else {
			super.handleCase(policeCase);
		}
	}
}

