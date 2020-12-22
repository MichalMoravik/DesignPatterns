package bar;

import bar.courses.IBartenderCourse;
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
		for (String step: preparationSteps) {
			System.out.println(step);
		}
		System.out.println("Giving you the drink...");
	}

	public abstract String getName();
	public abstract String getTitle();
	public abstract void improve(IBartenderCourse bartenderCourse);
}
