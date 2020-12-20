package com.patterns.adapter;

public class Person {
	private IRailcar railcar;

	public Person(IRailcar railcar) {
		this.railcar = railcar;
	}

	public void driveRailcar() {
		railcar.driveRailcar();
	}
}

