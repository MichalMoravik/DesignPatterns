package com.patterns.observer;

public class ConcreteObserver implements IObserver {
	public ConcreteObserver() {}

	@Override
	public void update(int price, ISubject subject) {
		if (price < 60) {
			System.out.println("I am bidding more!");
			((ConcreteSubject) subject).setPrice(price + 20);
		} else {
			System.out.println("Leaving the bid!");
		}
	}
}

