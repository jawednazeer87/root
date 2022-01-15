package org.la.core.java.student.tanseer.assignment5.arrays;

import java.util.Arrays;

public class Program06PositiveNumbers 
{

	public static void main(String[] args) 
	{
		int[] a = {10 , -9 , -6 , 11 , -100 , -99 };
		
		System.out.println(Arrays.toString(a));
		System.out.println();
		
		System.out.println("Positive elements of array :");
		for(int i = 0; i < a.length ; i++)
		{
			if(a[i] > 0)
			{
				System.out.print(" "+a[i]);
			}
		}
	}

}
