package org.la.core.java.student.tanseer.assignment4.loops;

/*
wap to pre increment a number n multiply with a number and assign product to a variable, print both variables
	6.	wap to post increment a number n multiply with a number and assign product to a variable, print both variables
*/
public class Program99Practice8 
{
	public static void main(String[] args) 
	{
		int n = 5;
		++n;
		int m = n * 10;
		
		System.out.println(" n : "+n);
		System.out.println(" m : "+m);
		
		
		int a = 5;
		
		int b = a++ + a * 10;
		
		System.out.println(" a : "+a);
		System.out.println(" b : "+b);
		
	}
}

