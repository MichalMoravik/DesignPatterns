package drinks.basic;

import drinks.DrinkDifficulty;
import drinks.IDrink;

public class Wine implements IDrink {
	private float price, alcoholPercentage;
	private String name;
	private DrinkDifficulty drinkDifficulty;
	private WineType wineType;
	private String[] preparationSteps;

	public Wine(float price, float alcoholPercentage, String name,
				WineType wineType, String[] preparationSteps) {
		this.price = price;
		this.alcoholPercentage = alcoholPercentage;
		this.name = name;
		this.drinkDifficulty = DrinkDifficulty.MEDIUM;
		this.wineType = wineType;
		this.preparationSteps = preparationSteps;
	}

	public WineType getWineType() {
		return wineType;
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

	@Override
	public void printReceipt() {
		String wineType = getWineType().name().toLowerCase();

		System.out.println("You chose " + getName() +
				", which is a " + wineType + " wine with " + getAlcoholPercentage() + "% of alcohol. " +
				"It will cost you " + getPrice() + " €.");
	}
}
