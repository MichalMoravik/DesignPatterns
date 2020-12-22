package bar.courses;


import bar.HeadBartender;
import bar.JuniorBartender;
import bar.SeniorBartender;

public class AdvancedShakingTechniques implements IBartenderCourse {

	@Override
	public void improveHeadBartender(HeadBartender headBartender) {
		System.out.println(headBartender.getName() + ": Hi, I came to refresh my memory a bit.");
		System.out.println("* We can implement/change/improve the bartender or other classes here *");
	}

	@Override
	public void improveJuniorBartender(JuniorBartender juniorBartender) {
		System.out.println(juniorBartender.getName() + ": Hi, I just came here to look at my guys, it may be fun.");
		System.out.println("* We can implement/change/improve the bartender or other classes here *");
	}

	@Override
	public void improveSeniorBartender(SeniorBartender seniorBartender) {
		System.out.println(seniorBartender.getName() + ": Hey, I would like to learn something new, please.");
		System.out.println("* We can implement/change/improve the bartender or other classes here *");
	}
}
