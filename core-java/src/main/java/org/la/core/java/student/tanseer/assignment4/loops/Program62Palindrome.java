package org.la.core.java.student.tanseer.assignment4.loops;

import java.util.Scanner;

public class Program62Palindrome {

	public static void main(String[] args) {
		
		int rev = 0 , digit;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse  :");
		int num = sc.nextInt();
		sc.close();
		
		int temp = num ;
		
		while(temp != 0) 
		{
			digit = temp % 10;
			rev = rev * 10 + digit ;
			temp = temp / 10;
		}
		
		System.out.println("The number before reverse : "+num);
		System.out.println("The number after reverse : "+rev);
		
		
		
	}
}