package drinks.cocktails.decorators;

import drinks.DrinkDifficulty;
import drinks.cocktails.ICocktail;

public abstract class CocktailDecorator implements ICocktail {
	private ICocktail cocktail;

	public CocktailDecorator(ICocktail cocktail) {
		this.cocktail = cocktail;
	}

	@Override
	public void printReceipt() { cocktail.printReceipt(); }

	@Override
	public String[] getPreparationSteps() { return cocktail.getPreparationSteps(); }

	@Override
	public float getSugarMilliliters() {
		return cocktail.getSugarMilliliters();
	}

	@Override
	public float getLemonMilliliters() {
		return cocktail.getLemonMilliliters();
	}

	@Override
	public float getPrice() {
		return cocktail.getPrice();
	}

	@Override
	public String getName() {
		return cocktail.getName();
	}

	@Override
	public float getAlcoholPercentage() {
		return cocktail.getAlcoholPercentage();
	}

	@Override
	public DrinkDifficulty getDrinkDifficulty() {
		return cocktail.getDrinkDifficulty();
	}
}
