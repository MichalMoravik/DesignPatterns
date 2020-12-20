package com.patterns.builder;

public class Director {
	public void constructCustomer(Builder builder) {
		builder.setName("Michal");
		builder.setAge(12);
		builder.setRole("customer");
	}

	public void constructAdmin(Builder builder) {
		builder.setCanEditContent(true);
		builder.setRole("admin");
	}
}
