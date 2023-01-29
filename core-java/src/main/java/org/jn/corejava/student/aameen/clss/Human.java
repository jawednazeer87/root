package org.jn.corejava.student.aameen.clss;

public class Human {
	public int age ;
	
	public void set(int a )
	{
		age =a;
		if(a<=0)
		{
			throw new RuntimeException("age cannot be negative or egual to zero");
		}
		
		
		
	}
	public void print()
	{
		System.out.println("Age of human : "+age);
	}
	public int get()
	{
		return age;
	}
}
