package org.jn.core.java.jawed.clss;

public class BookMain {
	
	public static void main(String[] args) {
		Book book = new Book();
		book.author = "kalim";
		book.numOfPages = 50;
		book.print();
		
		Book book2 = new Book();
		book2.author = "salim";
		book2.numOfPages = 500;
		book2.print();
		
		System.out.println("book: "+book);
		System.out.println("book2: "+book2);
	}
}
