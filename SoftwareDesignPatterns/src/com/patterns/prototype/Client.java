package com.patterns.prototype;

public class Client {
	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		Shape clonedRectangle = (Shape) rectangle.clone();

		rectangle.draw();
		clonedRectangle.draw();

		System.out.println("Rectangle's hash code: " + System.identityHashCode(rectangle));
		System.out.println("Cloned rectangle's hash code: " + System.identityHashCode(clonedRectangle));
	}
}

