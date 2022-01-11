package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program40AddFiveToArray 
{

	public static void main(String[] args) 
	{
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};

		System.out.println("Original array :");
		for(int b : a)
		{
			System.out.print(b + " ");
		}

		for(int i = 0; i < a.length; i++)
		{
			a[i] += 5;
		}

		System.out.println();
		System.out.println("after adding 5 to array");

		for(int b : a)
		{
			System.out.print(b + " ");
		}
	}	
	
}
