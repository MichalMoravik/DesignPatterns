package drinks.cocktails;

import drinks.DrinkDifficulty;
import drinks.IDrink;

public class Cocktail implements ICocktail, IDrink {
	private float sugarMilliliters, lemonMilliliters, price, alcoholPercentage;
	private String name;
	private boolean isShakeable;
	private DrinkDifficulty drinkDifficulty;

	public Cocktail(float sugarMilliliters, float lemonMilliliters, float price, float alcoholPercentage,
					String name, boolean isShakeable, DrinkDifficulty drinkDifficulty) {
		this.sugarMilliliters = sugarMilliliters;
		this.lemonMilliliters = lemonMilliliters;
		this.price = price;
		this.alcoholPercentage = alcoholPercentage;
		this.name = name;
		this.isShakeable = isShakeable;
		this.drinkDifficulty = drinkDifficulty;
	}


	@Override
	public float getSugarMilliliters() {
		return sugarMilliliters;
	}

	@Override
	public float getLemonMilliliters() {
		return lemonMilliliters;
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public float getAlcoholPercentage() {
		return alcoholPercentage;
	}

	@Override
	public boolean isShakeable() {
		return isShakeable;
	}

	@Override
	public DrinkDifficulty getDrinkDifficulty() {
		return drinkDifficulty;
	}
}
