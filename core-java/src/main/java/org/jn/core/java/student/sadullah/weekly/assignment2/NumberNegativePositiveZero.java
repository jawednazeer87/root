package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class NumberNegativePositiveZero {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number to fin whether it is a negative numer or positive number or a zero.");
		
		int num = newscan.nextInt();
		
		if (num < 0) {
			System.out.println("The number is a negative number.");
		} else if (num > 0) {
			System.out.println("The number is a positive number");
		} else {
			System.out.println("The number is zero.");
		}
	}
}
