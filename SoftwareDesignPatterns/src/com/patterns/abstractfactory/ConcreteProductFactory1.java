package com.patterns.abstractfactory;

public class ConcreteProductFactory1 implements AbstractProductFactory {
	public ProductA getProductA() {
		return new ConcreteProductA1();
	}
	public ProductB getProductB() {
		return new ConcreteProductB1();
	}
}


