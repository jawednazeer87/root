package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program32SecondLargestElement 
{

	public static void main(String[] args) 
	{
		int[] a = new int[] {11, 22, 33, 44, 55, 88, 100};
		int temp ;
		
		for(int i = 0; i < a.length ; i++)
		{
			for(int j = i + 1; j < a.length ; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(" Second Largest Element is : "+a[a.length - 2]);
	}	
	
}
