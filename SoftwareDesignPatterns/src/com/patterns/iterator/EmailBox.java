package com.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

// the collection of emails
public class EmailBox implements ICollection {
	List<Email> emails;

	public EmailBox(List<Email> emailsPar)
	{
		emails = new ArrayList<>();
		emails.addAll(emailsPar);
	}

	public IIterator createIterator()
	{
		return new EmailIterator(emails);
	}
}


