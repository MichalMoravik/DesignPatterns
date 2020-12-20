package com.patterns.factorymethod;

public class PolygonFactory {
	public static Polygon getPolygon(int numberOfPoints) {
		if (numberOfPoints == 3) {
			return new Triangle();
		} else if (numberOfPoints == 4) {
			return new Square();
		} else {
			return new Pentagon();
		}
	}
}

