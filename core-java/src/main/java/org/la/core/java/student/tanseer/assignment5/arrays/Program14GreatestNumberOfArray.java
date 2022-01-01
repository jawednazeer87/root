package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program14GreatestNumberOfArray 
{

	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30, 40, 150, 60, 70, 80};
		int great = a[0];
		
		for(int i = 1; i < a.length; i++)
		{
			if(great < a[i])
			{
				great = a[i];
			}
		}
		System.out.println(" Greatest Element of array is : "+great);
		
		
	}

}
