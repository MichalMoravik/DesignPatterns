package com.patterns.iterator;

public interface IIterator {
	// indicates whether there are more elements to
	// iterate over
	boolean hasNext();

	// returns the next element
	Object next();
}


