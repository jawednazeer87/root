package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 *  void printPositive(int[])
		method will print all negative number from supplied array
 */
public class Program02PositiveNumberArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {10, -10, 20, -20, 30, -30};
		printPositive(arr);
	}
	

	static void printPositive(int[] a)
	{

		System.out.println(Arrays.toString(a));
		
		System.out.println("Positvite Array elements are : ");
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] > 0)
			{
				System.out.println(a[i]);
			}
		}
	}
}

