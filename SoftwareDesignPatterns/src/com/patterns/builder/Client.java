package com.patterns.builder;

public class Client {
	public static void main(String[] args) {
		Director director = new Director();

		CustomerBuilder builder = new CustomerBuilder();
		director.constructCustomer(builder);
		Customer customer = builder.getCustomer();
		System.out.println(customer.toString());


		AdminBuilder builder2 = new AdminBuilder();
		director.constructAdmin(builder2);
		Admin admin = builder2.getAdmin();
		System.out.println(admin.toString());
	}
}

