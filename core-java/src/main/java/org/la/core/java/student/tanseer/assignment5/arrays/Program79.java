package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to check whether a given number is positive and double digit or single digit number 
 */

public class Program79 
{

	public static void main(String[] args) 
	{
		int num = 2;
		
		if(num > 0 && num > 9 && num < 100)
			System.out.println("Positive and double digit ");
		
		else if(num > 0 && num < 9)
			System.out.println("Positive and Single digit ");
		
		else
			System.out.println("Not under specified condition");
	}	

}
