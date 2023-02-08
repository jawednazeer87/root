package org.jn.core.java.student.shoaeeb.polymorphism;

public class Program1 {
	
	
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 p = new Program1();
		p.add(1, 2);
		p.add(1, 2, 3);
	}

}
