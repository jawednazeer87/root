package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question56 {

	//		56.	Wap to find first and last digit of a number. 548745
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number To print first and last digit of a number : ");
		
		int num  = sc.nextInt();
		int first = num;
		int last = num%10;
		
		while(first >=10) {
			first /= 10;
		}
		System.out.println("First digit of "+num+" : " + first);
		System.out.println("Last digit of "+num+" : " + last);
		
		
		
	}
}
