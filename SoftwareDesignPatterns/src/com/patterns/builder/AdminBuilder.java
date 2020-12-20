package com.patterns.builder;

public class AdminBuilder implements Builder {
	private String name;
	private int age;
	private String role;
	private boolean canEditContent;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public void setCanEditContent(boolean canEditContent) {
		this.canEditContent = canEditContent;
	}

	public Admin getAdmin() {
		return new Admin(name, age, role, canEditContent);
	}
}






