package org.la.core.java.student.tanseer.assignment8.main.classes;

import org.la.core.java.student.tanseer.assignment8.classes.Books;

public class BooksMain 
{
	public static void main(String[] args) 
	{
		Books book = new Books();
		book.bookName = "Physics";
		book.pages = 1000;
		book.version = 2.43;
		book.author = "Tim";
		book.print();
	}
}
