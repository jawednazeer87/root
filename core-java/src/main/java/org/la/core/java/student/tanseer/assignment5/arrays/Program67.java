package org.la.core.java.student.tanseer.assignment5.arrays;

/*
 * wap to print double if number is a double digit 
 */

public class Program67 
{

	public static void main(String[] args) 
	{
		int num = -144;
		
		if( (num > 9 && num < 100) || (num < -9 && num > -100))
		{
			System.out.println("Double digit number : "+num);
		}
		else
		{
			System.out.println("Not Double digit number : "+num );
		}
	}	
	
	
}
