package bar.courses;

import bar.HeadBartender;
import bar.JuniorBartender;
import bar.SeniorBartender;

public class CocktailTraining implements IBartenderCourse {

	@Override
	public void improveHeadBartender(HeadBartender headBartender) {
		System.out.println(headBartender.getName() + ": Hi, I just came here to look at my guys.");
		System.out.println("* We can implement/change/improve the bartender or other classes here *");
	}

	@Override
	public void improveJuniorBartender(JuniorBartender juniorBartender) {
		System.out.println(juniorBartender.getName() + ": Hey guys, I want to learn how to make cocktails!");
		System.out.println("* We can implement/change/improve the bartender or other classes here *");
	}

	@Override
	public void improveSeniorBartender(SeniorBartender seniorBartender) {
		System.out.println(seniorBartender.getName() + ": Hi boys, I think I need to refresh my memory a bit.");
		System.out.println("* We can implement/change/improve the bartender or other classes here *");
	}
}
