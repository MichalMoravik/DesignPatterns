package drinks.cocktails.decorators;

import drinks.cocktails.ICocktail;

public class MoreSourCocktailDecorator extends CocktailDecorator {
	public MoreSourCocktailDecorator(ICocktail cocktail) {
		super(cocktail);
	}

	// adds one third of the original lemon juice milliliters
	// to the lemon juice milliliters and returns this new amount
	@Override
	public float getLemonMilliliters() {
		return super.getLemonMilliliters() / 3 * 4;
	}
}
