package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to find factorial of a given number
 */

public class Program65 
{

	public static void main(String[] args) 
	{
		int n = 5;
		int fact = 1;
		
		for(int i = n; i > 0; i--)
		{
			fact = fact * i;
		}
		
		System.out.print(fact);
	}	
	
	
}
