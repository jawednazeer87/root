package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program13SumOfArrayElements 
{

	public static void main(String[] args) 
	{
		
		int[] a = {10, 20, 30, 40, 50, 60, 70, 80};
		int sum = 0;
		
		int size ;
		
		for(size = 0 ; size < a.length ; size++)
		{
			for(int arr : a)
			{
				System.out.println(" Array ["+size+"] = " + arr);
				
			}
			
		}
		
	
		for(int i = 0; i < a.length ; i++)
		{
			sum = sum + a[i];
		}

		System.out.println("Sum of array elements are : "+ sum);
		
	}

}
