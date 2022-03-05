package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import org.la.core.java.student.tanseer.assignment9.inheritance.child.DefaultConstructorChild;
import org.la.core.java.student.tanseer.assignment9.inheritance.child.DefaultConstructorChildTwo;

public class DefaultConstructorMain 
{
	public static void main(String[] args) 
	{
		DefaultConstructor df = new DefaultConstructorChild(); // first parent class constructor is called then child class
		
		System.out.println();
		
		DefaultConstructorChild ds = new DefaultConstructorChildTwo(); // sub child class constructor invoking all default constructors
	
		
	}
}
