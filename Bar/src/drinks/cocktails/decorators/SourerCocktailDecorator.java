package drinks.cocktails.decorators;

import drinks.cocktails.ICocktail;

public class SourerCocktailDecorator extends CocktailDecorator {
	public SourerCocktailDecorator(ICocktail cocktail) {
		super(cocktail);
	}

	// adds one third of the original lemon juice milliliters
	// to the lemon juice milliliters and returns this new amount
	@Override
	public float getLemonMilliliters() {
		return super.getLemonMilliliters() / 3 * 4;
	}

	@Override
	public void printReceipt() {
		System.out.println("You chose " + super.getName() + " cocktail with " +
			super.getSugarMilliliters() + "ml of sugar syrup, " +
			getLemonMilliliters() + "ml of lemon juice, and " +
			super.getAlcoholPercentage() + "% of alcohol. It will cost you " + super.getPrice() + " €.");
	}
}
