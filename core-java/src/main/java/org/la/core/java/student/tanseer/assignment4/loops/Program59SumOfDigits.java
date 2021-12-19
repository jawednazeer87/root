package org.la.core.java.student.tanseer.assignment4.loops;

import java.util.Scanner;

public class Program59SumOfDigits {

	public static void main(String[] args) {
		int digit,sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		sc.close();
		
		while(num > 0) 
		{
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		System.out.println("Sum of number is : "+ sum);
	}
}