package org.jn.core.java.jawed.clss;

import org.jn.core.java.jawed.clss.model.Book;

public class BookModelMain {
	public static void main(String[] args) {
		Book book = new Book();
		book.setPrice(90);
		book.setName("elements of physics");
		book.setSubject("physics");
		int price = book.getPrice();
		String name = book.getName();
		String sub = book.getSubject();
		System.out.println("name: "+book.getName());
		System.out.println("subject: "+book.getSubject());
		System.out.println("price: "+book.getPrice());
	}
}
