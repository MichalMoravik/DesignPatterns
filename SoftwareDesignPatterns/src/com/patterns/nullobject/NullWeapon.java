package com.patterns.nullobject;

public class NullWeapon implements IWeapon {
	@Override
	public void use() {
		System.out.println("I do nothing man!");
	}
}
