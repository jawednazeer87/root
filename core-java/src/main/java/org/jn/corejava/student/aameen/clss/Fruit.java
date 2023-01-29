package org.jn.corejava.student.aameen.clss;

public class Fruit {
	
 	public String name;
	public String color;
	public int price;
	public String taste;
	
	public void Setter(String nm,String clr,int pr,String tst)
	{
		name=nm;
		color=clr;
		price=pr;
		taste=tst;
	}
	public void print()
	{
		System.out.println("Name : "+name);
		System.out.println("Color : "+color);
		System.out.println("Price : "+price);
		System.out.println("Taste : "+taste);
	}
}
