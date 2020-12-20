package com.patterns.chainofresponsibility;

public class DEA extends PoliceUnit {

	public DEA(PoliceUnit nextPoliceUnit) {
		super(nextPoliceUnit);
	}

	@Override
	public void handleCase(Case policeCase) {
		if (policeCase.getCaseType().equals(CaseType.DRUGS)) {
			printHandling(policeCase);
		} else {
			super.handleCase(policeCase);
		}
	}
}

