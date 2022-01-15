package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * int[] copy(int[])
	create an array and copy supplied array and return that new array

 */
public class Program07CopyArrayReturnType 
{

	public static void main(String[] args) 
	{
		int[] a = {10 , 20 , 30, 40, 50};
		copy(a);
	
	}
	
	static int[] copy(int[] a)
	{
		int[] b = new int[a.length];
		for(int i  = 0; i < a.length; i++)
		{
			b[i] = a[i];
		}
		
		System.out.println("New array is : "+Arrays.toString(b));
		return b;
	}
	
}

