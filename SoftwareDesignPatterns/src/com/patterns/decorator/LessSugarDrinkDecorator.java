package com.patterns.decorator;

public class LessSugarDrinkDecorator extends DrinkDecorator {

	public LessSugarDrinkDecorator(IDrink drink) {
		super(drink);
	}

	@Override
	public int sugarLevel() {
		return super.sugarLevel() - 5;
	}
}


