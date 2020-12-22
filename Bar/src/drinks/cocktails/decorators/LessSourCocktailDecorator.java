package drinks.cocktails.decorators;

import drinks.cocktails.ICocktail;

public class LessSourCocktailDecorator extends CocktailDecorator {
	public LessSourCocktailDecorator(ICocktail cocktail) {
		super(cocktail);
	}

	// returns two thirds of the original lemon juice milliliters
	@Override
	public float getLemonMilliliters() {
		return super.getLemonMilliliters() / 3 * 2;
	}

	@Override
	public void printReceipt() {
		System.out.println("You chose " + super.getName() + " cocktail with " +
			super.getSugarMilliliters() + "ml of sugar syrup, " +
			getLemonMilliliters() + "ml of lemon juice, and " +
			super.getAlcoholPercentage() + "% of alcohol. It will cost you " + super.getPrice() + " €.");
	}
}
