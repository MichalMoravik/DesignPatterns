package com.patterns.iterator;

import java.util.List;

public class EmailIterator implements IIterator {
	private int index;
	private List<Email> emails;

	public EmailIterator(List<Email> emails) {
		this.emails = emails;
	}

	@Override
	public boolean hasNext() {
		return index < emails.size();
	}

	@Override
	public Object next() {
		if (this.hasNext()) {
			return emails.get(index++);
		}
		return null;
	}
}



