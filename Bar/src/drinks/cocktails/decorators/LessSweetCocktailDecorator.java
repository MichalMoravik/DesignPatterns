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
}
