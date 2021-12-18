package org.la.core.java.student.tanseer.assignment4.loops;

import java.util.Scanner;

public class Program64PowerOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the exponential power : ");
		int expo = sc.nextInt();
		
		long power = 1;
		
		for(int i = 1 ; i <= expo ; i++) {
			power = power * num;
		}
		System.out.println("\n The Final result of " + num + " power " + expo + " = " + power);
		
		sc.close();
	}
	
}