package org.la.core.java.student.tanseer.assignment5.arrays;

import java.util.Arrays;

public class Program11CopyArray 
{

	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30, 40, 50};
		int[] b = new int[a.length];
		int[] c = b;
		for(int i = 0; i < a.length; i++)
		{
			 b[i] = a[i];
		}
		
		b[2] = 400 ;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		
	}

}
