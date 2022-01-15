package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program45AddAllEvenNumbers 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {10, 19, 2, 7 };
		int sum = 0;

		for(int b : a)
		{
			System.out.print(b + " ");
		}

		for(int i = 0; i < a.length ; i++)
		{
			if(a[i] % 2 == 0)
			{
				sum = sum + a[i];
			}
		}

		System.out.println();
		System.out.print("Sum of even numbers is "+ sum+ " ");

	}	
	
}
