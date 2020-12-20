package com.patterns.flyweight;

public class HealingPotion implements Potion {
	public HealingPotion() {
	}

	@Override
	public void drink() {
		System.out.println("You are healed. The object code: " + System.identityHashCode(this));
	}
}

