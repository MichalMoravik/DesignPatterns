package com.patterns.strategy;

public class Taxicab implements IVehicle {
	@Override
	public void transport() {
		System.out.println("Transporting using taxicab");
	}
}

