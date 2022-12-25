package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class LessThan100 {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number to find if it is less than 100 or not");
		
		int num = newscan.nextInt();
		
		if (num <100) {
			System.out.println("The number is less than 100.");
		} else {
			System.out.println("The number is more than 100.");
		}
	}
}
