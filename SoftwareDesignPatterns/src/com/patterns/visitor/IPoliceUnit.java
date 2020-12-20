package com.patterns.visitor;

public interface IPoliceUnit {
	void attack();
	void defend();
	// accept additional functionality from visitor
	void accept(IPoliceTraining policeTraining);
}

