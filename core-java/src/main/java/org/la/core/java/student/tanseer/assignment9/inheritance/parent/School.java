package org.la.core.java.student.tanseer.assignment9.inheritance.parent;
/*
 * Create a parent class School having 3 methods, void numStudents(int), String address() 
 * and void name(String), create 5 child class which will override 3 methods of parent class.
 */
public class School 
{
	protected void numStudents(int n)
	{
		System.out.println("Number of students :"+n);
	}
	
	public String address()
	{
		String ad = "India, Bangalore";
		return ad;
	}
	
	protected void name(String name)
	{
		System.out.println("Student name : "+name);
	}
}
