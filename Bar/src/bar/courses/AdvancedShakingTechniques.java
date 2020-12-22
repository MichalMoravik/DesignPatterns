package bar.courses;


import bar.HeadBartender;
import bar.JuniorBartender;
import bar.SeniorBartender;

public class AdvancedShakingTechniques implements IBartenderCourse {

	@Override
	public void improveHeadBartender(HeadBartender headBartender) {
		System.out.println(headBartender.getName() + ", a " + headBartender.getTitle()
				+ ", came to this course just to practise his shaking a bit.");
		// We can implement/change/improve the bartender or other classes here
	}

	@Override
	public void improveJuniorBartender(JuniorBartender juniorBartender) {
		System.out.println(juniorBartender.getName() + ", a " + juniorBartender.getTitle()
				+ ", came to this course just to observe what more experienced bartenders do");
		// We can implement/change/improve the bartender or other classes here
	}

	@Override
	public void improveSeniorBartender(SeniorBartender seniorBartender) {
		System.out.println(seniorBartender.getName() + ", a " + seniorBartender.getTitle() +
				", came to this course to learn new shaking techniques.");
		// We can implement/change/improve the bartender or other classes here
	}
}
