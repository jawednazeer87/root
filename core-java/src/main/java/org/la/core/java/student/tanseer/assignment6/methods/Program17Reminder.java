package org.la.core.java.student.tanseer.assignment6.methods;

/*
 * int reminder(int, int) - find remainder and return 

 */
public class Program17Reminder 
{

	public static void main(String[] args) 
	{
		int a = 8;
		int b = 7;
		int ans = reminder(a, b);
		System.out.println("Reminder of "+a+" * "+b+" = "+ans);
	}
	
	static int reminder(int num1 , int num2)
	{
		int rem = num1 % num2;	
		return rem;
	}
}

