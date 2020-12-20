package com.patterns.chainofresponsibility;

public class TacticalUnit extends PoliceUnit {

	public TacticalUnit(PoliceUnit nextPoliceUnit) {
		super(nextPoliceUnit);
	}

	@Override
	public void handleCase(Case policeCase) {
		if (policeCase.getCaseType().equals(CaseType.MURDER)) {
			printHandling(policeCase);
		} else {
			super.handleCase(policeCase);
		}
	}
}


