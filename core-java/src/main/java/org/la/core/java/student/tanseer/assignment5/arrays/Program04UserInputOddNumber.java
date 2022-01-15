package org.la.core.java.student.tanseer.assignment5.arrays;

/*
04) wap to print only odd numbers from an array
 */ 

public class Program04UserInputOddNumber
{

	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Odd Elements in array are :");
		
		for(int i = 0; i < a.length; i++ )
		{
			
			if(a[i] % 2 != 0)
			{
				 System.out.print( " "+a[i]); 
			}
			
		}
		
	}

}
