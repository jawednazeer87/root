package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program38LargestAndSmallest 
{

	public static void main(String[] args) 
	{
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
		int great = a[0], small = a[0] ;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > great)
			{
				great = a[i];
			}
			else if(a[i] < small)
			{
				small = a[i];
				
			}
		}
		
		System.out.println("Largest element is : "+great);
		System.out.println("Smallest element is : "+small);
	}	
	
}
