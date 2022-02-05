package org.la.core.java.student.tanseer.assignment4.loops;

import java.util.Scanner;

public class Program67PrimeNumberOneToN 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number till where you want to print prime : ");
		int n = sc.nextInt();
		int num ;
		int i;
		
		for(num = 2 ; num <=n ; num ++) 
		{
			for( i = 2; i < num; i++ )
			{
				if(num % i == 0)
				{
					//System.out.println(" Not Prime :" +num);
					break;
				}
			}
			if(i == num) 
			{
				System.out.print(num + " ");
				//System.out.println("Prime Number : "+num);
			}
		}	
	}
	
}