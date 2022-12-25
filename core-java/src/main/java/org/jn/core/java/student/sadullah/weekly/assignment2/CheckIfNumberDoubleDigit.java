package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class CheckIfNumberDoubleDigit {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter number to check whether double digit or not.");
		
		int num = newscan.nextInt();
		
		if ((num >= -99 && num <=-10) || (num <= 99 && num >=10) ) {
			System.out.println("Double digit.");
		} else {
			System.out.println("Error");
		}
		
	}
}
