package org.la.core.java.student.tanseer.assignment4.loops;

import java.util.Scanner;

public class Program66 
{
	public static void main(String[] args) 
	{
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		for(int i = 2 ; i <= num /2 ;) {
			if(num % i == 0) 
				flag = false;
			break;
		}
		
		if(flag)
			System.out.println(num +" is a prime number ");
		else
			System.out.println(num +" is not a prime number ");
		
		sc.close();
	}
	
}