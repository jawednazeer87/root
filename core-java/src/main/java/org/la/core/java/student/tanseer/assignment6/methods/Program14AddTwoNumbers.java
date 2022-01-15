package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * int add(int, int) - add two numbers and return sum

 */
public class Program14AddTwoNumbers 
{

	public static void main(String[] args) 
	{
		int a = -140;
		int b = 100;
		int ans = add(a, b);
		System.out.println("Sum of "+a+" + "+b+" = "+ans);
	}
	
	static int add(int num1 , int num2)
	{
		int sum = num1 + num2;	
		return sum;
	}
}

