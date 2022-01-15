package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * int smallest(int[])
		find smallest element of an array and return that smallest value

 */
public class Program11SmallestNumber 
{

	public static void main(String[] args) 
	{
		int[] a = {10 , 20 , 30, -555 ,500 , 40, 50 ,50};
		int min = smallest(a);
		System.out.println(min);
	}
	
	static int smallest(int[] a)
	{
		int min = a[0];
		System.out.println(Arrays.toString(a));
		
		for(int a1 : a)
		{
			if(a1 < min)
			{
				min = a1;
			}
		}
		System.out.print("smallest number is : ");
		return min;
	}
}

