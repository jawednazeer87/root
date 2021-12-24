package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question62 {

//	62.	Wap to check whether a number is palindrome or not.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number To print Reverse : ");
		
		int num  = sc.nextInt();
		int clone = num;
		int reverse = 0;
		while(clone!=0) {
			int rem = clone % 10;
			reverse = reverse*10 + rem;
			
			clone /= 10;
		}
		if(num == reverse)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
