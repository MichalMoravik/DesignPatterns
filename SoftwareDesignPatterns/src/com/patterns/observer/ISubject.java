package com.patterns.observer;

public interface ISubject {
	void attach(IObserver os);
	void detach(IObserver os);
	void notifyObservers();
}

