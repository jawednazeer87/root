package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program15SmallestNumberOfArray 
{

	public static void main(String[] args) 
	{
		int[] a = {-10, -20, 30, 40, -150, 60, 70, 80};
		int small = a[0];
		
		for(int i = 1; i < a.length; i++)
		{
			if(small > a[i])
			{
				small = a[i];
			}
		}
		System.out.println(" Smallest Element of array is : "+small);
		
		
	}

}
