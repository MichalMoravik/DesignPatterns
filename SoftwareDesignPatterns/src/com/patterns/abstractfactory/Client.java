package com.patterns.abstractfactory;

public class Client {
	public static void main(String[] args) {
		// factoryNumber can vary in different situations
		int factoryNumber = 2;
		AbstractProductFactory productFactory;

		if (factoryNumber == 1) {
			productFactory = new ConcreteProductFactory1();
		} else {
			productFactory = new ConcreteProductFactory2();
		}

		System.out.println(productFactory.getProductA().getType());
		System.out.println(productFactory.getProductB().getType());
	}
}


