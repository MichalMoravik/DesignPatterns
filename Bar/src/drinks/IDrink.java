package drinks;

public interface IDrink {
	float getPrice();
	String getName();
	float getAlcoholPercentage();
	boolean isShakeable();
	DrinkDifficulty getDrinkDifficulty();
}
