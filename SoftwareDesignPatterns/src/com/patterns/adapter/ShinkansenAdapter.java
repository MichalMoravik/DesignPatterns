package com.patterns.adapter;

public class ShinkansenAdapter implements IRailcar {
	private Shinkansen shinkansen;

	public ShinkansenAdapter() {
		shinkansen = new Shinkansen();
	}

	@Override
	public void driveRailcar() {
		shinkansen.drive();
	}
}



