package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question59 {

	//		59.	Wap to calculate sum of digits of a number.    847587
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number To print sum : ");
		
		int num  = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			int rem =num%10;
			sum += rem;
			num /= 10;
		}
		System.out.println(sum);
		
	}
}
