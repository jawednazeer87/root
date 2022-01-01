package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program05EvenNumbersArray 
{

	public static void main(String[] args) 
	{
		int even[] = new int[15];
		System.out.println("Even number of the array :");
		
		for(int i = 0 ; i < even.length ; i ++)
		{
			even[i] = i + 1 ;
			
			if(even[i] % 2 == 0)
			{
				System.out.print(" "+ even[i]);
			}
		}
	}

}
