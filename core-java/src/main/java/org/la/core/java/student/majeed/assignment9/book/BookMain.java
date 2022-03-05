package org.la.core.java.student.majeed.assignment9.book;
/*
 * 02.	Create a parent class Book having void read() method create 2 child class of Book class and will override read method.
 */

public class BookMain {
	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new ScienceBook();
		Book book2 = new HistoryBook();
		
		book.read();
		book1.read();
		book2.read();
	}
}
