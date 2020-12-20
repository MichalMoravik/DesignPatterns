package com.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDepartment implements IEmployee {
	private List<IEmployee> employeeList = new ArrayList<IEmployee>();

	@Override
	public void showEmployeeDetails()
	{
		for(IEmployee emp:employeeList)
		{
			emp.showEmployeeDetails();
		}
	}

	public void addEmployee(IEmployee emp)
	{
		employeeList.add(emp);
	}
}


