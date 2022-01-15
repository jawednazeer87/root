package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to print hi if number is zero and by if number is 100
 */

public class Program66 
{

	public static void main(String[] args) 
	{
		int n = 100;
		boolean flag = true;
		
		
		if(n == 0 || n == 100)
		{
			flag = false;
			System.out.println("Hi");
		}
		
		if(flag)
		{
			System.out.println("Number is neither 0 nor 100");
		}
		
		
	}	
	
	
}
