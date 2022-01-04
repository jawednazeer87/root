package org.la.core.java.student.tanseer.assignment5.arrays;

import java.util.Arrays;

public class Program18AddTwoArrays 
{

	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30, 40, 50, 60, 70, 80};
		int[] b = {90, 100, 110, 120 ,130, 140};
		int size = a.length < b.length ? a.length : b.length ;
		int[] c = new int[a.length] ;
		
		for(int i = 0; i < size; i++ )
		{
			c[i] = a[i] + b[i];
		}
		
		System.out.println(Arrays.toString(c));
	}

}
