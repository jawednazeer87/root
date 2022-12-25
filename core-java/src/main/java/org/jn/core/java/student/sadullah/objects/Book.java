package org.jn.core.java.student.sadullah.objects;

public class Book {
	public int edition;
	public String author;
	public int numOfPages;
	public String bookName;
	
	public void print() {
		System.out.println("Book name: " +bookName);
		System.out.println("Edition number: " +edition);
		System.out.println("Author name: " +author);
		System.out.println("Number of pages: " +numOfPages);
	}
	
}
