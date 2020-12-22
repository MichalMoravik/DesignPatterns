package bar;

import drinks.IDrink;

public class Bar {
	private Bartender bartender;

	public Bar() {
		bartenderOptions();
	}

	private void bartenderOptions() {
		bartender = new HeadBartender(new SeniorBartender(new JuniorBartender(null, "Stephan"), "Daniel"), "Henrik");
	}

	void askBartenderForDrink(IDrink drink) {
		bartender.handleOrder(drink);
	}
}
