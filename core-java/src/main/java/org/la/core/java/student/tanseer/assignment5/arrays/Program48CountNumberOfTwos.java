package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program48CountNumberOfTwos 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {1, 19, 1, 7, 1, 3};
		int count = 0;

		for(int b : a)
		{
			System.out.print(b + " ");
		}

		for(int i = 0; i < a.length ; i++)
		{
			if(a[i] == 1)
			{
				count ++ ;
			}
		}

		System.out.println();
		if(count == 0)
		{
			System.out.print("Number of 1's is "+ count);
		}
		else
		System.out.print("Number of 1's is "+ count);

	}	
	
}
