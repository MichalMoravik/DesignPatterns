package com.patterns.facade;

public class Radiator {
	private int speed;

	public Radiator(int speed) {
		this.speed = speed;
	}

	public void on() {
		System.out.println("Radiator set on!");
	}

	public void off() {
		System.out.println("Radiator set off!");
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
