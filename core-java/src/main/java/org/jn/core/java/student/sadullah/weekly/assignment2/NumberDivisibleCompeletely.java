package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class NumberDivisibleCompeletely {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number that will be divided by another number entered, which will be checked if it is completely divisble by that number");
		
		int num1 = newscan.nextInt();
		int num2 = newscan.nextInt();
		
		if (num1%num2 == 0) {
			System.out.println("The number is completely divisible.");
		} else {
			System.out.println("The number is not divisible completely.");
		}
	
	}
}
