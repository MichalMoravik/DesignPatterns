package com.additionalmaterial;

public final class ImmutableClassAuthor {
	final private String[] publishedBooks;
	final private int age;

	public ImmutableClassAuthor(String[] publishedBooks, int age) {
		this.publishedBooks = publishedBooks;
		this.age = age;
	}

	public String[] getPublishedBooks() {
		return publishedBooks;
	}

	public int getAge() {
		return age;
	}


}

