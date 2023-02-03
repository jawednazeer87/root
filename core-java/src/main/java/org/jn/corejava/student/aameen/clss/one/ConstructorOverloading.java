package org.jn.corejava.student.aameen.clss.one;

public class ConstructorOverloading {
	
	public ConstructorOverloading()
	{
		System.out.println("default constructor");
	}
	
	public ConstructorOverloading(int id)
	{
		System.out.println("id : "+id);
	}
	
	public ConstructorOverloading(String name)
	{
		System.out.println("name : "+name);
	}
	
	public ConstructorOverloading(int id , String name)
	{
		System.out.println("id : "+id +", name : "+name);
	}
	
}
