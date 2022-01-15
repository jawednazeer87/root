package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * int sub(int, int) - subtract two numbers and return result

 */
public class Program15SubtractTwoNumbers 
{

	public static void main(String[] args) 
	{
		int a = -140;
		int b = 100;
		int ans = sub(a, b);
		System.out.println("Subtraction of "+a+" - "+b+" = "+ans);
	}
	
	static int sub(int num1 , int num2)
	{
		int sum = num1 - num2;	
		return sum;
	}
}

