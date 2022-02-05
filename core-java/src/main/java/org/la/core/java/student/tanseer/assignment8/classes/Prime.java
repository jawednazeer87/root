package org.la.core.java.student.tanseer.assignment8.classes;

import java.util.Scanner;

public class Prime 
{
	int n;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check prime or not :");
		n = sc.nextInt();
		sc.close();
	}
	
	public void checkPrime()
	{
		boolean flag = true;
		
		for(int i = 2; i <= n/2 ; i++)
		{
			if(n % i == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.print("Number is prime :" +n);
		else
			System.out.print("Number is not prime :"+n);
	}
}
