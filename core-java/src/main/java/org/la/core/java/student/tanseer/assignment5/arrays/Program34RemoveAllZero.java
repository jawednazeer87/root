package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program34RemoveAllZero 
{

	public static void main(String[] args) 
	{
		int[] a = {10 , 0 ,20, 0 , 0 , 0, 100, 50, 0};
		int count = 0;
		
		System.out.println("Original Array");
		for(int b : a)
		{
			
			System.out.print(b+ " ");
		}
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != 0)
			{
				a[count ++] = a[i];
			}
		}
		System.out.println();
		System.out.println("After Removing zero :");
		for(int i = 0; i < count; i++)
		{
			System.out.print(a[i] + " ");
		}
	}	
	
}
