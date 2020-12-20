package com.patterns.chainofresponsibility;

// HANDLER
public abstract class PoliceUnit {
	private PoliceUnit nextPoliceUnit;

	public PoliceUnit(PoliceUnit nextPoliceUnit) {
		this.nextPoliceUnit = nextPoliceUnit;
	}

	public void handleCase(Case policeCase) {
		if (nextPoliceUnit != null) {
			nextPoliceUnit.handleCase(policeCase);
		}
	}

	public void printHandling(Case policeCase) {
		System.out.println(this.getClass().getSimpleName() +
				" handling a case of type: " + policeCase.getCaseType());
	}
}

