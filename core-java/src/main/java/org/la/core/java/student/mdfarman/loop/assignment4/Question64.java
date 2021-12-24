package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question64 {

//		64.	Wap to find power of a number using for loop.


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base and power : ");
		int base = sc.nextInt();
		int pow = sc.nextInt();
		int result = 1;
		
		for(int i = 1 ; i<=pow; i++) {
			result *= base;
		}
		System.out.println(result);
		sc.close();
		
		
	}
}
