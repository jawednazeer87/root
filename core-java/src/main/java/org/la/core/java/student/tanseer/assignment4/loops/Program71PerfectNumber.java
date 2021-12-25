package org.la.core.java.student.tanseer.assignment4.loops;

public class Program71PerfectNumber 
{
	public static void main(String[] args) 
	{
		int num = 6;
		int sum = 0;
		
		for( int i = 1; i < num ; i ++)
		{
			if( num % i == 0)
			{
				//System.out.print(i+" ");
				sum = sum + i;
			}
			
		}
		if(sum == num)
		{
			System.out.println(num + " is Perfect number");
		}
		else
			System.out.println(num + " not a perfect number");
	}		
}