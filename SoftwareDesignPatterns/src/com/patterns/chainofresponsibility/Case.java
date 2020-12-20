package com.patterns.chainofresponsibility;

public class Case {
	private CaseType caseType;

	public Case(CaseType caseType) {
		this.caseType = caseType;
	}

	public CaseType getCaseType() {
		return caseType;
	}
}


