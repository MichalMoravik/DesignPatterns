package drinks.cocktails.decorators;

import drinks.cocktails.ICocktail;

public class LessSweetCocktailDecorator extends CocktailDecorator {
	public LessSweetCocktailDecorator(ICocktail cocktail) {
		super(cocktail);
	}

	// returns two thirds of the original sugar syrup milliliters
	@Override
	public float getSugarMilliliters() {
		return super.getSugarMilliliters() / 3 * 2;
	}

	@Override
	public void printReceipt() {
		System.out.println("You chose " + super.getName() + " cocktail with " +
			getSugarMilliliters() + "ml of sugar syrup, " +
			super.getLemonMilliliters() + "ml of lemon juice, and " +
			super.getAlcoholPercentage() + "% of alcohol. It will cost you " + super.getPrice() + " €.");
	}
}
