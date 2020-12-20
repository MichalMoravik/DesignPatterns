package com.patterns.nullobject;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	public static void main(String[] args) throws IOException {
		// input from user - can vary during the runtime
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String chosenWeapon = reader.readLine();

		IWeapon weapon;

		switch (chosenWeapon) {
			case "AK47":
				weapon = new AK47Weapon();
				break;
			default:
				weapon = new NullWeapon();
				break;
		}

		weapon.use();
	}
}
