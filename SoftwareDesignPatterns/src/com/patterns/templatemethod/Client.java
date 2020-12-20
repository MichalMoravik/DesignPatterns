package com.patterns.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
	public static void main(String[] args) throws IOException {
		// the image may be already set before so no matter what
		// type we chose to import, we can still extract colors from it
		Image image = null;

		System.out.println("Hi, please import an image :)");

		// a type detected / selected
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String chosenType = reader.readLine();

		if (chosenType.equals("JPG")) {
			image = new JPG();
		} else if (chosenType.equals("PNG")) {
			image = new PNG();
		}

		image.importImage();

		// it does not matter what image format we chose,
		// extracting is always same for all of them
		image.extractColors();
	}
}




