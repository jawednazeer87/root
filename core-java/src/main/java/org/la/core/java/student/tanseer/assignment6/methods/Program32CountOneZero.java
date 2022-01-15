package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * int[] countOneZero(int a[]) - a[] = {1,0,1,0,0,1,1};
		create an array having the count of zero and one in given array, 
		return zero and one count array.
		e.g the return array having r[] = {3, 4}
		a[] = {1,0,1,0,0,1,1}; - this array having 3 zeros and 4 ones

 */
public class Program32CountOneZero 
{

	public static void main(String[] args) 
	{
		int[] a = {1,0,1,0,0,1,1,1,1,1,1,0,0,0,0,0};
		countOneZero(a);
	}
	
	static int[] countOneZero(int a[])
	{
		int countOne = 0;
		int countZero = 0;
		int[] r = new int[2];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] == 1)
			{
				countOne++;
			}
			if(a[i] == 0)
			{
				countZero++;
			}
		}
		
		System.out.println(Arrays.toString(a));
		System.out.print("This array has "+countZero+" zeros and "+countOne+" ones ");
			r[0] = countZero;
			r[1] = countOne;
		
		return r;
	}
}

