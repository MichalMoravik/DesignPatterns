package drinks.cocktails.decorators;

import drinks.cocktails.ICocktail;

public class MoreSugaryCocktailDecorator extends CocktailDecorator {
	public MoreSugaryCocktailDecorator(ICocktail cocktail) {
		super(cocktail);
	}

	// adds one third of the original sugar syrup milliliters
	// to the sugar syrup milliliters and returns this new amount
	@Override
	public float getSugarMilliliters() {
		return super.getSugarMilliliters() / 3 * 4;
	}
}
