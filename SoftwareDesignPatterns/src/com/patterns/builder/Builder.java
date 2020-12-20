package com.patterns.builder;

public interface Builder {
	void setName(String name);
	void setAge(int age);
	void setRole(String role);
	void setCanEditContent(boolean canEditContent);
}
