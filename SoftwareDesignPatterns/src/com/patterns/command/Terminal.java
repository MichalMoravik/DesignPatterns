package com.patterns.command;

import java.util.Deque;
import java.util.LinkedList;

public class Terminal {
	private final Deque<String> stack = new LinkedList<>();

	public void addToStack(String text) {
		stack.add(text);
		System.out.println("The current stack: " + stack.toString());
	}

	public void removeFromStack() {
		String last = stack.pollLast();
		System.out.println(last + " was removed. ");
		System.out.println("The current stack: " + stack.toString());
	}
}


