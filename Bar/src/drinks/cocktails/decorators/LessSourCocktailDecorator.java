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
}
