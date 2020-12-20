package com.patterns.templatemethod;

public class JPG extends Image {

	@Override
	void importImage() {
		System.out.println("Importing image using JPG implementation");
	}
}

