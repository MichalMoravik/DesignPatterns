package drinks.cocktails;

import drinks.DrinkDifficulty;

public class Cocktail implements ICocktail {
	private float sugarMilliliters, lemonMilliliters, price, alcoholPercentage;
	private String name;
	private boolean isShakeable;
	private DrinkDifficulty drinkDifficulty;
	private String[] preparationSteps;

	public Cocktail(float sugarMilliliters, float lemonMilliliters, float price, float alcoholPercentage,
					String name, boolean isShakeable, DrinkDifficulty drinkDifficulty, String[] preparationSteps) {
		this.sugarMilliliters = sugarMilliliters;
		this.lemonMilliliters = lemonMilliliters;
		this.price = price;
		this.alcoholPercentage = alcoholPercentage;
		this.name = name;
		this.isShakeable = isShakeable;
		this.drinkDifficulty = drinkDifficulty;
		this.preparationSteps = preparationSteps;
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

	@Override
	public String[] getPreparationSteps() {
		return preparationSteps;
	}
}
