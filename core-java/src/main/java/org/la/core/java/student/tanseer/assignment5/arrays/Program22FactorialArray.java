package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program22FactorialArray 
{

	public static void main(String[] args) 
	{
		int a[] = new int[] {2, 4, 6, 8};
		int fact = 1;
		int k = a.length - 1;
		
		for(int i = 0; i <= k; i++)
		{
			for(int j = 1; j <= a[i]; j++ )
			{
				fact = fact * j;
			}
			System.out.println(" factorial of "+a[i]+" = "+fact);
			fact = 1;
		}
	}	
}
