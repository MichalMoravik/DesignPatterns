package bar.courses;

import bar.HeadBartender;
import bar.JuniorBartender;
import bar.SeniorBartender;

public class CocktailTraining implements IBartenderCourse {

	@Override
	public void improveHeadBartender(HeadBartender headBartender) {
		System.out.println(headBartender.getName() + ", a " + headBartender.getTitle() +
				", came to the cocktail course just to observe who is the best from his junior team.");
		// We can implement/change/improve the bartender or other classes here
	}

	@Override
	public void improveJuniorBartender(JuniorBartender juniorBartender) {
		System.out.println(juniorBartender.getName() + ", a " + juniorBartender.getTitle() +
				", came to the cocktail course to learn as many new cocktails as possible.");
		// We can implement/change/improve the bartender or other classes here
	}

	@Override
	public void improveSeniorBartender(SeniorBartender seniorBartender) {
		System.out.println(seniorBartender.getName() + ", a " + seniorBartender.getTitle() +
				", came to the cocktail course to refresh his memory a bit.");
		// We can implement/change/improve the bartender or other classes here
	}
}
