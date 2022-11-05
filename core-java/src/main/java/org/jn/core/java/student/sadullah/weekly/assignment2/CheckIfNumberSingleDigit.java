package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class CheckIfNumberSingleDigit {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter number to check whether single digit or not.");
		
		int num = newscan.nextInt();
		
		if (num >= -9 && num <=9 ) {
			System.out.println("Single digit.");
		} else {
			System.out.println("Error");
		}
	}
}
