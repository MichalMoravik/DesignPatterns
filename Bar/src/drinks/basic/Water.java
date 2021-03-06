package drinks.basic;

import drinks.DrinkDifficulty;
import drinks.IDrink;

public class Water implements IDrink {
	private float price, alcoholPercentage;
	private String name;
	private DrinkDifficulty drinkDifficulty;
	private String[] preparationSteps;

	public Water(float price, String name, String[] preparationSteps) {
		this.price = price;
		this.alcoholPercentage = 0.0f;
		this.name = name;
		this.drinkDifficulty = DrinkDifficulty.EASY;
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
	public DrinkDifficulty getDrinkDifficulty() {
		return drinkDifficulty;
	}

	@Override
	public String[] getPreparationSteps() {
		return this.preparationSteps;
	}

	@Override
	public void printReceipt() {
		System.out.println("You chose " + getName() +
				" water. It will cost you " + getPrice() + " €.");
	}
}
