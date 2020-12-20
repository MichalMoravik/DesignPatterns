package com.patterns.factorymethod;

public class ClassNeedingPolygon {
	public String getTypeOfPolygon(Polygon polygon) {
		return polygon.getType();
	}
}

