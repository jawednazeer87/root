package org.la.core.java.student.mdfarman.loop.assignment4;

import java.util.Scanner;

public class Question53 {

	//		53.	Wap to find sum of all odd numbers between 1 to n.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to print sum : ");
		int start = 1 , end = sc.nextInt();
		int sum = 0;
		while(start<=end) {
			if(start%2!=0)
				sum += start;
			start++;
		}	
		System.out.println("Sum of odd Number from 1 to "+end+" : "+sum);

	}
}
