package com.patterns.templatemethod;

public abstract class Image {
	// function which is gonna be implemented
	// differently by various image formats
	abstract void importImage();

	// function same for all image formats
	public void extractColors() {
		System.out.println("Extracting colors ...");
	}
}


