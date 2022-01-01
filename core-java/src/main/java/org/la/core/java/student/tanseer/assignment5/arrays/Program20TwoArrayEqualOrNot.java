package org.la.core.java.student.tanseer.assignment5.arrays;

import java.util.Arrays;

public class Program20TwoArrayEqualOrNot 
{

	public static void main(String[] args) 
	{
//		int a[] = {2, 4, 6, 8, 10, 12};
//		int b[] = {1, 3, 2, 6, 5, 12, 15};
		
		int a[] = {2, 4, 6, 8, 10, 12};
		int b[] = {2, 4, 6, 8, 10, 11};
		
		boolean isEqual = true ;
		
		if(a.length == b.length)
		{
			for(int i = 0; i < b.length; i++)
			{
				if(a[i] != b[i])
				{
					isEqual = false;
				}
			}
		}
		
		else
		{
			isEqual = false ;
		}
		
		if(isEqual)
		{
			System.out.println("Two arrays are equal :");
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
		}
		else
		{
			System.out.println("Two arrays are not equal :");
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(b));
		}
	}	
}
