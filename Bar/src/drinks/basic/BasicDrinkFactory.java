package drinks.basic;

import drinks.IDrink;

public class BasicDrinkFactory {
	public static IDrink getDrink(String chosenDrink) {
		if (chosenDrink.equalsIgnoreCase("1")) {
			String[] preparationSteps = {
					"Taking the beer opener",
					"Opening the beer lid"};
			return new Beer(15.5f, 5.0f, "Carlsberg", preparationSteps);

		} else if (chosenDrink.equalsIgnoreCase("2")) {
			String[] preparationSteps = {
					"Taking the wine opener",
					"Removing the cork",
					"Pouring the wine to the glass"};
			return new Wine(25.9f, 12.0f, "La Marca Prosecco", WineType.PROSECCO, preparationSteps);

		} else {
			String[] preparationSteps = {"Opening the bottle."};
			return new Water(15.3f,"Ramlösa", preparationSteps);
		}
	}
}
