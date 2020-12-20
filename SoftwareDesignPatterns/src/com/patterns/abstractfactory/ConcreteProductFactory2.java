package com.patterns.abstractfactory;

public class ConcreteProductFactory2 implements AbstractProductFactory {
	public ProductA getProductA() {
		return new ConcreteProductA2();
	}
	public ProductB getProductB() {
		return new ConcreteProductB2();
	}
}


