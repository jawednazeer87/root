package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question58 {

	//		58.	Wap to swap first and last digits of a number.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number To print first and last digit of a number : ");
		
		int num  = sc.nextInt();
		int first = num;
		int last = num%10;
		
		while(first >=10) {
			first /= 10;
		}
		System.out.println("First digit of "+num+" before swaping: " + first);
		System.out.println("Last digit of "+num+" before swaping: " + last);
		
		int temp = first;
		first = last;
		last = temp;
		System.out.println("\n*********************** after swaping **************\n");
		
		System.out.println("First digit of "+num+" after swaping: " + first);
		System.out.println("Last digit of "+num+" after swaping: " + last);
		
		
		
		
	}
}
