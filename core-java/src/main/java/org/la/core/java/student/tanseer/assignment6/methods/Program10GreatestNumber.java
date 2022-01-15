package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * int greatest(int[])
	find greatest element of an array and return that greatest value

 */
public class Program10GreatestNumber 
{

	public static void main(String[] args) 
	{
		int[] a = {10 , 20 , 30, -555 ,500 , 40, 50 ,50};
		int great = greatest(a);
		System.out.println(great);
		
	}
	
	static int greatest(int[] a)
	{
		int max = a[0];
		//for(int i = 0; i < a.length ; i++)
		System.out.println(Arrays.toString(a));
		for(int a1 : a)
		{
			if(a1 > max)
			{
				max = a1;
			}
		}
		System.out.print(" Greatest number is : ");
		return max;
	}
}

