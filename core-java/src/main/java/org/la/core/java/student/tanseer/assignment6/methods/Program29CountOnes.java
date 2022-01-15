package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * int countOnes(int a[])  a[] = {1,2,1,3,2,1,1,1};
	count number of times one in array and return count


 */
public class Program29CountOnes 
{

	public static void main(String[] args) 
	{
		int[] a = {1,2,1,3,2,1,1,1};
		System.out.println(Arrays.toString(a));
		int count = countOnes(a);
		System.out.println(count);
	}
	
	static int countOnes(int a[])
	{
		int count = 0;
		
		for(int i = 0; i < a.length ; i++)
		{
			if(a[i] == 1)
			{
				count++;
			}
		}
		
		if(count == 0)
		{
			System.out.println("Number of ones are : "+count);
		}
		else
		{
			System.out.print("Number of ones are : ");
		}
		
		return count;
	}
}

