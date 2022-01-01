package org.la.core.java.student.tanseer.assignment5.arrays;

//import java.util.Arrays;

/*
04) wap to print only odd numbers from an array
 */ 

public class Program04SystemInputOddNumbers
{

	public static void main(String[] args)
	{
		int[] a = new int[15];
		
		System.out.println("Odd Elements in array are :");
		
		for(int i = 0; i < a.length; i++ )
		{
			a[i] = i + 1;
			
			if(a[i] % 2 != 0)
			{
				System.out.print(" "+a[i]); 
				
			}
			
		}
		
		
	}

}
