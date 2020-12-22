package bar;

import bar.courses.IBartenderCourse;
import drinks.DrinkDifficulty;
import drinks.IDrink;

public class HeadBartender extends Bartender {
	private String name;

	public HeadBartender(Bartender nextBartender, String name) {
		super(nextBartender);
		this.name = name;
	}

	@Override
	void handleOrder(IDrink drink) {
		if (drink.getDrinkDifficulty().equals(DrinkDifficulty.HARD)) {
			System.out.println("Hello, I am " + name + ", a head bartender here at SDP");
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
		return "Head Bartender";
	}

	@Override
	public void improve(IBartenderCourse bartenderCourse) {
		bartenderCourse.improveHeadBartender(this);
	}
}
