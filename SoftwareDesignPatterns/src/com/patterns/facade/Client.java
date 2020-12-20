package com.patterns.facade;

public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.startEngine();
		facade.stopEngine();
	}
}
