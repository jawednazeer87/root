package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program44DivideEachElementWithTwo 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {10, 19, 2, 7 };

		for(int b : a)
		{
			System.out.print(b + " ");
		}

		for(int i = 0; i < a.length ; i++)
		{
			a[i] /= 2;
		}

		System.out.println();
		for(int b : a)
		{
			System.out.print(b + " ");
		}
	}	
	
}
