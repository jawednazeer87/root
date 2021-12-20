package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question61 {

//	61.	Wap to enter a number and print its reverse.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number To print Reverse : ");
		
		int num  = sc.nextInt();
		int reverse = 0;
		while(num!=0) {
			int rem = num % 10;
			reverse = reverse*10 + rem;
			
			num /= 10;
		}
		System.out.println(reverse);
		
	}
}
