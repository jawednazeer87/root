package org.la.core.java.student.tanseer.assignment9.inheritance.child;

public class MemberMethodsAccessSpecifier 
{
	private int getId(int n)
	{
		System.out.println("Private getID() method being called in same class :");
		return n;
	}
	public String getName()
	{
		String name = "Default";
		return name;
	}
	protected void setEmail()
	{
		System.out.println("email() method");
	}
	void setWeight()
	{
		System.out.println("weight() method");
	}
	
	
}
