package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program37SeperateOddEvenNumbers 
{

	public static void main(String[] args) 
	{
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
		
		for(int b : arr)
		{
			System.out.print(b + " ");
		}
		
		System.out.println();
		System.out.println("Even Numbers");
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("Odd Numbers");
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 1)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
	}	
	
}
