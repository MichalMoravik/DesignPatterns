package drinks.cocktails;

import drinks.DrinkDifficulty;

public class CocktailFactory {
	public static ICocktail getCocktail(String chosenCocktail) {
		if (chosenCocktail.equalsIgnoreCase("1")) {
			String[] preparationSteps = {
					"Putting ice to the old fashioned glass.",
					"Putting ice, sugar syrup, lemon juice, whisky, egg white",
					"Shaking for 15 seconds"};
			return new Cocktail(5.0f, 15.0f, 75.90f, 20.0f, "Whisky Sour", true, DrinkDifficulty.HARD, preparationSteps);
		} else if (chosenCocktail.equalsIgnoreCase("2")) {
			String[] preparationSteps = {
					"Putting ice to the highball glass.",
					"Putting sugar syrup, lemon juice, ginger beer, dark rum.",
					"Stirring for 5 seconds."};
			return new Cocktail(12.5f, 6.0f, 70.50f, 22.0f, "Dark 'N' Stormy", false, DrinkDifficulty.MEDIUM, preparationSteps);
		} else {
			String[] preparationSteps = {
					"Putting ice to the lowball glass.",
					"Putting gin and then tonic.",
					"Stirring for 5 seconds."};
			return new Cocktail(0.0f, 0.0f, 60.0f, 18.0f, "Gin & Tonic", false, DrinkDifficulty.EASY, preparationSteps);
		}
	}
}
