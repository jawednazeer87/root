package org.la.core.java.student.tanseer.assignment9.inheritance.parent;

import java.util.Arrays;

/*
 * 15.	Create a parent class having int[] copy(int[]) method, override this method in 
 * child class copy method will copy provided array to new array and will return new array.
 */
public class CopyArray 
{
	protected int[] copy(int[] a)
	{
		int[] b = new int[a.length];
		
		System.out.println("Original Array");
		for(int arr : a)
		{
			System.out.print(arr +" ");
		}
		System.out.println();
		for(int i = 0; i < a.length ; i++)
		{
			b[i] = a[i];
		}
		System.out.println("Copied Array is :"+Arrays.toString(b));
	
		return b;
	}
}
