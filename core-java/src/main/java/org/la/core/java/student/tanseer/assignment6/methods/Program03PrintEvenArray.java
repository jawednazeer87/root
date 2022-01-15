package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 *  void printEven(int[])
	method will print all even number from supplied array

 */
public class Program03PrintEvenArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,2,1,3,4,5,6,7,8,9,10};
		printEven(arr);
	}
	

	static void printEven(int[] a)
	{
		System.out.println(Arrays.toString(a));
		System.out.println("Even elements of array are ");
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.println(a[i]);
			}
		}
	}
}

