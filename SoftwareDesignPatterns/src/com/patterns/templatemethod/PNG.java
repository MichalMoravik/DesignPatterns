package com.patterns.templatemethod;

public class PNG extends Image {

	@Override
	void importImage() {
		System.out.println("Importing image using PNG implementation");
	}
}

