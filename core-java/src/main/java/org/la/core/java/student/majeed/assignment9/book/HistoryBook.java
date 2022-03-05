package org.la.core.java.student.majeed.assignment9.book;
/*
 * 02.	Create a parent class Book having void read() method create 2 child class of Book class and will override read method.
 */

public class HistoryBook extends Book {
	@Override
	public void read() {
		System.out.println("read history book");
	}

}
