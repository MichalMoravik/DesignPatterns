package com.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Email> emails = new ArrayList<>();
		emails.add(new Email("Hey this is your mom, nice email"));
		emails.add(new Email("Hey man, long time no see..."));
		emails.add(new Email("What is this email thingy? - your grandma"));
		EmailBox emailBox = new EmailBox(emails);

		IIterator myIterator = emailBox.createIterator();
		while (myIterator.hasNext())
		{
			Email email = (Email)myIterator.next();
			System.out.println(email.getEmail());
		}
	}
}


