package org.la.core.java.student.tanseer.assignment9.inheritance.child;

import org.la.core.java.student.tanseer.assignment9.inheritance.parent.Book;

public class BookChildTwo extends Book 
{
	@Override
	protected void read() 
	{	
		super.read();
		System.out.println("Book Child 2");
	}
}