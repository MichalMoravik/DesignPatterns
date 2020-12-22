package bar;

import bar.courses.IBartenderCourse;
import drinks.DrinkDifficulty;
import drinks.IDrink;

public class SeniorBartender extends Bartender {
	private String name;

	public SeniorBartender(Bartender nextBartender, String name) {
		super(nextBartender);
		this.name = name;
	}

	@Override
	void handleOrder(IDrink drink) {
		if (drink.getDrinkDifficulty().equals(DrinkDifficulty.MEDIUM)) {
			System.out.println("Hi, I am " + name + ", a senior bartender at SDP");
		} else {
			super.handleOrder(drink);
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getTitle() {
		return "Senior Bartender";
	}

	@Override
	public void improve(IBartenderCourse bartenderCourse) {
		bartenderCourse.improveSeniorBartender(this);
	}
}
