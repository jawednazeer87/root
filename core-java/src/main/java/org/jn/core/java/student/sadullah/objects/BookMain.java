package org.jn.core.java.student.sadullah.objects;

public class BookMain {
	public static void main(String[] argrs) {
		Book book1 = new Book();
		book1.edition = 1;
		book1.author = "James";
		book1.numOfPages = 230;
		book1.bookName = "Book 1";
		
		book1.print();
		System.out.println("Book 1 address in memory: " +book1);
		
		System.out.println("");
		
		Book book2 = new Book();
		book2.edition = 1;
		book2.bookName = "Book 2";
		book2.author = "Garner";
		book2.numOfPages = 890;
		
		book2.print();
		System.out.println("Book 2 address in memory: " +book2);

	}
}
