package drinks.cocktails.decorators;

import drinks.cocktails.ICocktail;

public abstract class CocktailDecorator implements ICocktail {
	private ICocktail cocktail;

	public CocktailDecorator(ICocktail cocktail) {
		this.cocktail = cocktail;
	}

	@Override
	public float getSugarMilliliters() {
		return cocktail.getSugarMilliliters();
	}

	@Override
	public float getLemonMilliliters() {
		return cocktail.getLemonMilliliters();
	}
}
