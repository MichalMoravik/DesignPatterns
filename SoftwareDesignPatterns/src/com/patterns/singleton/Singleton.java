package com.patterns.singleton;

public class Singleton {
	// declaring the only instance
	private static Singleton instance;

	//	constructor not accessible for other classes - cannot be instantiate in a different class
	private Singleton() {}

	// public and accessible method. The only instance can be accessed via this method.
	// if the instance is not instantiated yet, it will be done here, but only once (at the very beginning)
	public synchronized static Singleton getInstance() {
		if (instance == null) instance = new Singleton();
		return(instance);
	}
}
