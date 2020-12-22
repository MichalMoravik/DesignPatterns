package drinks.cocktails;

import drinks.IDrink;

public interface ICocktail extends IDrink {
	float getSugarMilliliters();
	float getLemonMilliliters();
	void printReceipt();
}
