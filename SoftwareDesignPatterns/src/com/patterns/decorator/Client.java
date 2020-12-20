package com.patterns.decorator;

public class Client {
	public static void main(String[] args) {
		WhiskySour whiskySour = new WhiskySour();
		System.out.println(whiskySour.sugarLevel());
		System.out.println(whiskySour.sourLevel());

		System.out.println("*** DECORATED BELOW ***");

		LessSugarDrinkDecorator lessSugarWhiskySour= new LessSugarDrinkDecorator(whiskySour);
		MoreSourDrinkDecorator moreSourWhiskySour = new MoreSourDrinkDecorator(lessSugarWhiskySour);
		System.out.println(moreSourWhiskySour.sugarLevel());
		System.out.println(moreSourWhiskySour.sourLevel());
	}
}


