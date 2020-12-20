package com.patterns.composite;

public class Client {
	public static void main(String[] args) {
		IEmployee dev1 = new Developer("Michal M", "Tech lead");
		IEmployee dev2 = new Developer("Daniel K", "Senior developer");
		CompanyDepartment productDevelopmentDepartment = new CompanyDepartment();
		productDevelopmentDepartment.addEmployee(dev1);
		productDevelopmentDepartment.addEmployee(dev2);

		IEmployee man1 = new Manager("Patrick H", "Project manager");
		IEmployee man2 = new Manager("Ivan M", "Lead project manager");
		CompanyDepartment productManagementDepartment = new CompanyDepartment();
		productManagementDepartment.addEmployee(man1);
		productManagementDepartment.addEmployee(man2);

		// thanks to composite, we can create more departments and
		// add the employees using the same process - by addingEmployee() but
		// now instead of adding employees separately, we add the whole department
		CompanyDepartment productDepartment = new CompanyDepartment();
		productDepartment.addEmployee(productDevelopmentDepartment);
		productDepartment.addEmployee(productManagementDepartment);
		// moreover, we can call the same method. In this case it will print out all
		// of the employees' method showEmployeeDetails()
		productDepartment.showEmployeeDetails();
	}
}


