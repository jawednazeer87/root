package org.la.core.java.student.tanseer.assignment5.arrays;

public class Program52CheckIfSumIsPrimeOrNot 
{

	public static void main(String[] args) 
	{
		int[] a = new int[] {10, 8, 2, 9};
		int sum = 0;
		
		for(int i = 0; i < a.length ; i++ )
		{
			sum += a[i];
		}
		
		int i ;
		
		for( i = 2 ; i < sum; i++)
		{
			if(sum % i == 0)
			{
				break;
			}
		}
		if(sum == i)
		{
			System.out.println("Sum is prime :"+ sum);
		}
		else
		{
			System.out.println("Sum is not prime :"+ sum);
		}
	}	
	
}
