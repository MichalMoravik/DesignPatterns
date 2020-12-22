package drinks;

public interface IDrink {
	float getPrice();
	String getName();
	float getAlcoholPercentage();
	DrinkDifficulty getDrinkDifficulty();
	String[] getPreparationSteps();
	void printReceipt();
}
