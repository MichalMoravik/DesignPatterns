package drinks.basic;

import drinks.DrinkDifficulty;
import drinks.IDrink;

public class Wine implements IDrink {
	private float price, alcoholPercentage;
	private String name;
	private DrinkDifficulty drinkDifficulty;
	private WineType wineType;
	private boolean isShakeable;
	private String[] preparationSteps;

	public Wine(float price, float alcoholPercentage, String name,
				WineType wineType, String[] preparationSteps) {
		this.price = price;
		this.alcoholPercentage = alcoholPercentage;
		this.name = name;
		this.drinkDifficulty = DrinkDifficulty.MEDIUM;
		this.wineType = wineType;
		this.isShakeable = false;
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
