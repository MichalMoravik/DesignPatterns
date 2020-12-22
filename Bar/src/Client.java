import drinks.cocktails.CocktailFactory;
import drinks.cocktails.ICocktail;
import drinks.cocktails.decorators.LessSourCocktailDecorator;
import drinks.cocktails.decorators.LessSweetCocktailDecorator;
import drinks.cocktails.decorators.SourerCocktailDecorator;
import drinks.cocktails.decorators.SweeterCocktailDecorator;

import java.io.IOException;

public class Client {
	public static void main(String[] args) throws IOException {
		String chosenSide = InputReader.getAnswer(
				"Welcome to SDP bar, please choose your side:",
				"1. Customer",
				"2. Bar Manager",
				"Your answer:");
		if (chosenSide.equalsIgnoreCase("1")) customerSide();
		else managerSide();
	}

	public static void customerSide() throws IOException {
		String chosenDrinkOption = InputReader.getAnswer(
				"Hi! welcome to SDP bar, what can I get you",
				"1. Beer", "2. Wine", "3. Water", "4. Cocktail");

		if (chosenDrinkOption.equalsIgnoreCase("4")) {
			String chosenCocktailOption = InputReader.getAnswer(
					"Well, look at the board please and choose your cocktail then",
					"1. Whisky Sour",
					"2. Dark 'N' Stormy",
					"3. Gin & Tonic",
					"Your answer:");

			ICocktail chosenCocktail = CocktailFactory.getCocktail(chosenCocktailOption);

			String chosenAcidity = InputReader.getAnswer(
					"How sour do you like it?",
					"1. Just normal",
					"2. Sourer",
					"3. Less sour");

			if (chosenAcidity.equalsIgnoreCase("2")) {
				chosenCocktail = new SourerCocktailDecorator(chosenCocktail);
			} else if (chosenAcidity.equalsIgnoreCase("3")) {
				chosenCocktail = new LessSourCocktailDecorator(chosenCocktail);
			}

			String chosenSweetness = InputReader.getAnswer(
					"How sweet do you like it?",
					"1. Just normal",
					"2. More sweet",
					"3. Less sweet");

			if (chosenSweetness.equalsIgnoreCase("2")) {
				chosenCocktail = new SweeterCocktailDecorator(chosenCocktail);
			} else if (chosenSweetness.equalsIgnoreCase("3")) {
				chosenCocktail = new LessSweetCocktailDecorator(chosenCocktail);
			}
		} else {

		}
	}

	public static void managerSide() throws IOException {
		System.out.println("TO BE DONE");
	}
}
