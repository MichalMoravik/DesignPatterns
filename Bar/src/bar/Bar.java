package bar;

import drinks.IDrink;

// CHAIN HANDLER
public class Bar {
	private Bartender bartender;

	public Bar() {
		bartender = new HeadBartender(new SeniorBartender(new JuniorBartender(null, "Stephan"), "Daniel"), "Henrik");
	}

	public void askBartenderForDrink(IDrink drink) {
		bartender.handleOrder(drink);
		bartender.prepareDrink(drink.getPreparationSteps());
	}
}
