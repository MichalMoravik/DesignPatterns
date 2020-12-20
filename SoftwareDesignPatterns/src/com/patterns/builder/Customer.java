package com.patterns.builder;

public class Customer {
	private String name;
	private int age;
	private String role;
	private boolean canEditContent;

	public Customer(String name, int age, String role, boolean canEditContent) {
		this.name = name;
		this.age = age;
		this.role = role;
		this.canEditContent = canEditContent;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", age=" + age +
				", role='" + role + '\'' +
				", canEditContent=" + canEditContent +
				'}';
	}
}
