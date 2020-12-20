package com.patterns.chainofresponsibility;

public class Client {
	public static void main(String[] args) {
		PoliceStation policeStation = new PoliceStation();
		policeStation.makeCase(new Case(CaseType.MURDER));
		policeStation.makeCase(new Case(CaseType.DRUGS));
		policeStation.makeCase(new Case(CaseType.BOMB));
	}
}

