package bar;

import bar.courses.IBartenderCourse;
import drinks.DrinkDifficulty;
import drinks.IDrink;

public class JuniorBartender extends Bartender {
	private String name;

	public JuniorBartender(Bartender nextBartender, String name) {
		super(nextBartender);
		this.name = name;
	}

	@Override
	void handleOrder(IDrink drink) {
		if (drink.getDrinkDifficulty().equals(DrinkDifficulty.EASY)) {
			System.out.println("Hey, I am " + name + ", a junior bartender at SDP");
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
		return "Junior Bartender";
	}

	@Override
	public void improve(IBartenderCourse bartenderCourse) {
		bartenderCourse.improveJuniorBartender(this);
	}
}
