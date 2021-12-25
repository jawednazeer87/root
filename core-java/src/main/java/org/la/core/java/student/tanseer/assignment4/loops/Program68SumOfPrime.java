package org.la.core.java.student.tanseer.assignment4.loops;

// Sum of prime numbers

public class Program68SumOfPrime 
{
	public static void main(String[] args) 
	{
		int n = 110 ;
		int sum = 0;
		int i ;
		
		
		System.out.println("Prime numbers till N : ");
		for( int num = 2 ; num < n ; num ++)
		{
		
			for(i = 2 ; i <= num ; i++ )
			{
				if(num % i == 0) 
				{
					
					break;
				}
			
			}
			if(i == num) 
			{
				System.out.print(num + " " );
				sum = sum + num;
			}
			
		}	
		
		System.out.println();
	
		System.out.println("Sum Of N prime numbers is  : "+sum);
		
	}
	
}