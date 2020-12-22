package bar;

import drinks.IDrink;

public abstract class Bartender {
	private Bartender nextBartender;

	public Bartender(Bartender nextBartender) {
		this.nextBartender = nextBartender;
	}

	void handleOrder(IDrink drink) {
		if (nextBartender != null) {
			nextBartender.handleOrder(drink);
		}
	}

	void prepareDrink(String... preparationSteps) {
		System.out.println("I am going to prepare your drink, sir.");
		for (String step: preparationSteps) {
			System.out.println(step);
		}
	}

	public abstract String getName();
	public abstract String getTitle();
}
