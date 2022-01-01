package org.la.core.java.student.tanseer.assignment5.arrays;

import java.util.Arrays;

/*
02) wap to create and print array using loop
 */ 

public class Program02
{

	public static void main(String[] args)
	{
		int[] arr = new int[4];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = i + 2 ;
		}
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println( " a ["+i+"] = "+arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}

}
