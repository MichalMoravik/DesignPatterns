package com.patterns.builder;

public class Admin {
	private String name;
	private int age;
	private String role;
	private boolean canEditContent;

	public Admin(String name, int age, String role, boolean canEditContent) {
		this.name = name;
		this.age = age;
		this.role = role;
		this.canEditContent = canEditContent;
	}

	@Override
	public String toString() {
		return "Admin{" +
				"name='" + name + '\'' +
				", age=" + age +
				", role='" + role + '\'' +
				", canEditContent=" + canEditContent +
				'}';
	}
}
