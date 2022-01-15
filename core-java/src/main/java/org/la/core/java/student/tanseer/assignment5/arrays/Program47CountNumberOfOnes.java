package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program47CountNumberOfOnes 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {10, 19, 2, 7};
		int count = 0;

		for(int b : a)
		{
			System.out.print(b + " ");
		}

		for(int i = 0; i < a.length ; i++)
		{
			if(a[i] == 2)
			{
				count ++ ;
			}
		}

		System.out.println();
		if(count == 0)
		{
			System.out.print("Number of 2's is "+ count);
		}
		else
		System.out.print("Number of 2's is "+ count);

	}	
	
}
