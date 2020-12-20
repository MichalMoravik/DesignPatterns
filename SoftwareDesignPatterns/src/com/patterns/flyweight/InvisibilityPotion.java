package com.patterns.flyweight;

public class InvisibilityPotion implements Potion {
	public InvisibilityPotion() {
	}

	@Override
	public void drink() {
		System.out.println("You are invisible. The object code: " + System.identityHashCode(this));
	}
}

