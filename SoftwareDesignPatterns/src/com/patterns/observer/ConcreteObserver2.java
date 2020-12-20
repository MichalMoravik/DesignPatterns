package com.patterns.observer;

public class ConcreteObserver2 implements IObserver {
	public ConcreteObserver2() {
	}

	@Override
	public void update(int price, ISubject subject) {
		if (price < 80) {
			((ConcreteSubject) subject).setPrice(price + 20);
			System.out.println("I am bidding more! " + ((ConcreteSubject) subject).getPrice());
		} else {
			System.out.println("Leaving the bid!");
		}
	}
}


