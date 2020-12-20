package com.patterns.decorator;

public class WhiskySour implements IDrink {

	@Override
	public int sugarLevel() {
		return 10;
	}

	@Override
	public int sourLevel() {
		return 15;
	}
}

