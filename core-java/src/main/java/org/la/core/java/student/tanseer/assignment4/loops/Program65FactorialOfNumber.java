package org.la.core.java.student.tanseer.assignment4.loops;

import java.util.Scanner;

public class Program65FactorialOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int fact = 1;
		
		for(int i = 1; i <= num ; i++) {
			fact = fact * i ;
		}
		System.out.println("Factorial of "+num+ " is "+ fact);
		
		sc.close();
	}
	
}