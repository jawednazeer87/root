package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program25AverageValueOfArrayElements 
{

	public static void main(String[] args) 
	{
		//int a[] = {2, 2, 3, 4, 2, 4, 3, 4, 2, 3};
		int a[] = {2, 2, 3, 4};
		double avg = 0.0;
		double sum = 0.0;
		
		for(int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
		}
		
		avg = sum / a.length;
		System.out.println("Average : "+avg);
	}	
}
