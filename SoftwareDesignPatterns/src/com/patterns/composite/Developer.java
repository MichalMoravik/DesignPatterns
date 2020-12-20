package com.patterns.composite;

public class Developer implements IEmployee {
	private String name;
	private String position;

	public Developer(String name, String position)
	{
		this.name = name;
		this.position = position;
	}

	@Override
	public void showEmployeeDetails()
	{
		System.out.println(name + " is a " + position);
	}
}


