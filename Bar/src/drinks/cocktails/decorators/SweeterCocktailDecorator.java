package drinks.cocktails.decorators;

import drinks.cocktails.ICocktail;

public class SweeterCocktailDecorator extends CocktailDecorator {
	public SweeterCocktailDecorator(ICocktail cocktail) {
		super(cocktail);
	}

	// adds one third of the original sugar syrup milliliters
	// to the sugar syrup milliliters and returns this new amount
	@Override
	public float getSugarMilliliters() {
		return super.getSugarMilliliters() / 3 * 4;
	}

	@Override
	public void printReceipt() {
		System.out.println("You chose " + super.getName() + " cocktail with " +
			getSugarMilliliters() + "ml of sugar syrup, " +
			super.getLemonMilliliters() + "ml of lemon juice, and " +
			super.getAlcoholPercentage() + "% of alcohol. It will cost you " + super.getPrice() + " €.");
	}
}
