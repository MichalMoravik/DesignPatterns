package com.patterns.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		IObserver observer1 =  new ConcreteObserver();
		IObserver observer2 = new ConcreteObserver2();

		ConcreteSubject subject = new ConcreteSubject(70);
		subject.attach(observer1);
		subject.attach(observer2);

		subject.notifyObservers();
	}
}

