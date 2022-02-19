package org.la.core.java.student.meenah.inherAssigment;

public class MainBook {

	public static void main(String[] args) {
		
		Book b = new RichDadBook();
		b.read();
		
		b = new EnglishBook();
		b.read();

	}

}
