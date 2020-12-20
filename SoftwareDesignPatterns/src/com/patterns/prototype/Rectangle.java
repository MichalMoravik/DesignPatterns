package com.patterns.prototype;

public class Rectangle extends Shape {

	public Rectangle(){
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("This is a draw function of a rectangle :)");
	}
}

