package org.la.corejava.student.aameen.clss;

public class Car {
	public String name ;
	public int price;
	
	public void setter(String nm , int pr)
	{
		name=nm;
		price=pr;
	}
	public void print()
	{
		System.out.println("Name : "+name);
		System.out.println("Price : "+price);
	}
	
}
