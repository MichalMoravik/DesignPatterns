package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject {
	List<IObserver> listOfObservers;
	private int price;

	public ConcreteSubject(int price) {
		this.listOfObservers = new ArrayList<>();
		this.price = price;
	}

	@Override
	public void attach(IObserver os) {
		this.listOfObservers.add(os);
	}

	@Override
	public void detach(IObserver os) {
		this.listOfObservers.remove(os);
	}

	@Override
	public void notifyObservers() {
		for (IObserver observer : this.listOfObservers) {
			observer.update(this.price, this);
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}


