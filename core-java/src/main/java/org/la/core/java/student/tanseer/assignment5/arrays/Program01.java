package org.la.core.java.student.tanseer.assignment5.arrays;

import java.util.Arrays;

/*
01) wap to create and print array using without loop
 */

public class Program01
{

	public static void main(String[] args)
	{
		int[] a = new int[3];
		
		a[0] = 15;
		a[1] = 20;
		a[2] = 25;
		
		System.out.println( "a[0] "+a[0]);
		System.out.println( "a[1] "+a[1]);
		System.out.println( "a[2] "+a[2]);
		
		
		System.out.println();
		System.out.println("Another way of printing array ");
		System.out.println(Arrays.toString(a));
	}

}
