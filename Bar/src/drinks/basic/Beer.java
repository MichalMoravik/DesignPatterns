package drinks.basic;

import drinks.DrinkDifficulty;
import drinks.IDrink;

public class Beer implements IDrink {
	private float price, alcoholPercentage;
	private String name;
	private DrinkDifficulty drinkDifficulty;
	private boolean isShakeable;
	private String[] preparationSteps;

	public Beer(float price, float alcoholPercentage, String name, String[] preparationSteps) {
		this.price = price;
		this.alcoholPercentage = alcoholPercentage;
		this.name = name;
		this.drinkDifficulty = DrinkDifficulty.EASY;
		this.isShakeable = false;
		this.preparationSteps = preparationSteps;
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
