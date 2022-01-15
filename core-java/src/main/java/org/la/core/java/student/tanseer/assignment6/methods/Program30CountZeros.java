package org.la.core.java.student.tanseer.assignment6.methods;

import java.util.Arrays;

/*
 * int countZero(int a[])  a[] = {1,0,1,0,0,1,1,0};
	count number of zeros and return 



 */
public class Program30CountZeros 
{

	public static void main(String[] args) 
	{
		int[] a = {1,0,1,0,0,1,1,0};
		System.out.println(Arrays.toString(a));
		int count = countZero(a);
		System.out.println(count);
	}
	
	static int countZero(int a[])
	{
		int count = 0;
		
		for(int i = 0; i < a.length ; i++)
		{
			if(a[i] == 0)
			{
				count++;
			}
		}
		
		if(count == 0)
		{
			System.out.println("Number of zero's are : "+count);
		}
		else
		{
			System.out.print("Number of zero's are : ");
		}
		
		return count;
	}
}

