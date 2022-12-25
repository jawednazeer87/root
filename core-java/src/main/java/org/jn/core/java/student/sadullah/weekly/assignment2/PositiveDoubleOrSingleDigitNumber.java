package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class PositiveDoubleOrSingleDigitNumber {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter number to check whether positive double or single digit number.");
		
		int num = newscan.nextInt();
		
		if (num >= 0 && num < 10) {
			System.out.println("Positive single digit number.");
		} else if (num >= 10 && num <= 99) {
			System.out.println("Positive double digit number.");
		} else {
			System.out.println("Error");
		}
	}
}
