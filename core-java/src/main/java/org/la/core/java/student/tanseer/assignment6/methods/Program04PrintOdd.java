package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 *  void printOdd(int[])
		method will print all odd number from supplied array

 */
public class Program04PrintOdd 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,2,1,3,4,5,6,7,8,9,10};
		printEven(arr);
	}
	

	static void printEven(int[] a)
	{
		System.out.println(Arrays.toString(a));
		System.out.println("Odd elements of array are ");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 1)
			{
				System.out.println(a[i]);
			}
		}
	}
}

