package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to print ternary if number is 3 digit
 */

public class Program69 
{

	public static void main(String[] args) 
	{
		int num = -999;
		
		if((num > 99 && num < 1000) || (num > -1000 && num <= -100))
		{
			System.out.println("Ternary digit number : "+num);
		}
		else
		{
			System.out.println("Not Ternary digit number : "+num );
		}
	}	
	
	
}
