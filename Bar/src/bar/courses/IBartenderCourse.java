package bar.courses;

import bar.HeadBartender;
import bar.JuniorBartender;
import bar.SeniorBartender;

// VISITOR INTERFACE
public interface IBartenderCourse {
	void improveHeadBartender(HeadBartender headBartender);
	void improveJuniorBartender(JuniorBartender juniorBartender);
	void improveSeniorBartender(SeniorBartender seniorBartender);
}
