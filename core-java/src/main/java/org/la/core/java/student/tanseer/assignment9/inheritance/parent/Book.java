package org.la.core.java.student.tanseer.assignment9.inheritance.parent;
/*
 * 02.	Create a parent class Book having void read() 
 * method create 2 child class of Book class and will override read method.
 */
public class Book 
{
	protected void read()
	{
		final int z = 10;
		System.out.println("Read method of parent class");
		System.out.println("Value of parent class z : "+z);
	}
}
