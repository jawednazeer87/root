package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 *  void copy(int[], int[])
		copy first array to second array

 */
public class Program06CopyArray 
{
	public static void main(String[] args) 
	{
		int[] arr1 = {10 , 20 , 30 ,40 ,50 ,60 , 70};
		int[] arr2 = new int[arr1.length];
		
		copy(arr1, arr2);
	}
	

	static void copy(int[] a , int[] b)
	{
		for(int i = 0; i < a.length ; i++)
		{
			b[i] = a[i];
		}
		
		System.out.print("First array :" + Arrays.toString(a));
		System.out.println();
		System.out.print("Second array :" + Arrays.toString(b));
		
	}
}

