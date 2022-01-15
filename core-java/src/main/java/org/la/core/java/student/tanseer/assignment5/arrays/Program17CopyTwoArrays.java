package org.la.core.java.student.tanseer.assignment5.arrays;

import java.util.Arrays;

public class Program17CopyTwoArrays 
{

	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30, 40, 50, 60, 70, 80};
		int[] b = {90, 100, 110, 120 ,130, 140, 150};
		
		int[] c = new int[a.length + b.length] ;
		
		for(int i = 0 ; i < a.length; i++ )
		{
			c[i] = a[i];
		}
		
		for(int i = 0 ; i < b.length; i++ )
		{
			c[a.length + i] = b[i];
		}
		
		for(int i = 0 ; i < c.length; i++ )
		{
			System.out.print(c[i]+" ,");
			
		}
		System.out.println();
		System.out.println(Arrays.toString(c));
		
	}

}
