package com.patterns.decorator;

public class MoreSourDrinkDecorator extends DrinkDecorator {

	public MoreSourDrinkDecorator(IDrink drink) {
		super(drink);
	}

	@Override
	public int sourLevel() {
		return super.sourLevel() + 10;
	}
}



