package com.patterns.decorator;

public abstract class DrinkDecorator implements IDrink {
	private IDrink drink;

	public DrinkDecorator(IDrink drink) {
		this.drink = drink;
	}

	@Override
	public int sugarLevel() {
		return drink.sugarLevel();
	}

	@Override
	public int sourLevel() {
		return drink.sourLevel();
	}
}


