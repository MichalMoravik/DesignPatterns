package com.patterns.factorymethod;

public class Main {

	public static void main(String args[]) {
		// the "number of points" could come from multiple sources
		int numberOfPoints = 4;
		// getting the polygon we want to see
		Polygon polygon = PolygonFactory.getPolygon(numberOfPoints);
		// calling method no matter what polygon is instantiated
		// each polygon will return different string
		ClassNeedingPolygon myClass = new ClassNeedingPolygon();
		System.out.println(myClass.getTypeOfPolygon(polygon));
	}
}


