package com.patterns.adapter;

public class Client {
	public static void main(String[] args) {
		Person person = new Person(new ShinkansenAdapter());
		person.driveRailcar();
	}
}


