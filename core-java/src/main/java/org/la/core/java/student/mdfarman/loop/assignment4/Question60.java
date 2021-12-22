package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question60 {

	//		60.	Wap to calculate product of digits of a number.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number To print Product : ");
		
		int num  = sc.nextInt();
		int pro = 1;
		while(num!=0) {
			int rem =num%10;
			pro *= rem;
			num /= 10;
		}
		System.out.println(pro);
		
	}
}
