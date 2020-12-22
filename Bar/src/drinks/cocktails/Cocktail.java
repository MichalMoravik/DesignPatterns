package drinks.cocktails;

import drinks.DrinkDifficulty;

public class Cocktail implements ICocktail {
	private float sugarMilliliters, lemonMilliliters, price, alcoholPercentage;
	private String name;
	private DrinkDifficulty drinkDifficulty;
	private String[] preparationSteps;

	public Cocktail(float sugarMilliliters, float lemonMilliliters, float price, float alcoholPercentage,
					String name, DrinkDifficulty drinkDifficulty, String[] preparationSteps) {
		this.sugarMilliliters = sugarMilliliters;
		this.lemonMilliliters = lemonMilliliters;
		this.price = price;
		this.alcoholPercentage = alcoholPercentage;
		this.name = name;
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
	public void printReceipt() {
		System.out.println("You chose" + this.getClass().getSimpleName() + getName() + " cocktail with " +
				getSugarMilliliters() + "ml of sugar syrup, " +
				getLemonMilliliters() + "ml of lemon juice, and " +
				getAlcoholPercentage() + "% of alcohol. It will cost you " + getPrice() + " €.");
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
	public DrinkDifficulty getDrinkDifficulty() {
		return drinkDifficulty;
	}

	@Override
	public String[] getPreparationSteps() {
		return preparationSteps;
	}


}
