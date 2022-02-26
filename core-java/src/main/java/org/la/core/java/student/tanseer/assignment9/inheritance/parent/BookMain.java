package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import org.la.core.java.student.tanseer.assignment9.inheritance.child.BookChildOne;
import org.la.core.java.student.tanseer.assignment9.inheritance.child.BookChildTwo;

public class BookMain 
{
	public static void main(String[] args) 
	{
		Book b1 = new BookChildOne();
		b1.read();
		System.out.println();
		
		b1 = new BookChildTwo();
		b1.read();
	}
}
