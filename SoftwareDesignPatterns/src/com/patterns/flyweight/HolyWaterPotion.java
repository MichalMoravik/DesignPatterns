package com.patterns.flyweight;

public class HolyWaterPotion implements Potion {
	public HolyWaterPotion() {
	}

	@Override
	public void drink() {
		System.out.println("You are blessed. The object code: " + System.identityHashCode(this));
	}
}

