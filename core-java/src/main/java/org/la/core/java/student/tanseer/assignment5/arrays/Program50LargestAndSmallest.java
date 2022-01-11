package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program50LargestAndSmallest 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {100, 30, -20, 0};
		int large = a[0] , small = a[0];

		for(int b : a)
		{
			System.out.print(b + " ");
		}

		for(int i = 0; i < a.length ; i++)
		{
			if( a[i] > large)
			{
				large = a[i];
			}
			if( a[i] < small)
			{
				small = a[i];
			}
		}
		System.out.println();
		System.out.println("Largest is :"+ large);
		System.out.println("Smallest is :"+ small);
	}	
	
}
