package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class CheckIfNumberTripleDigit {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter number to check whether triple digit or not.");
		
		int num = newscan.nextInt();
		
		if ((num >= -999 && num <=-100) || (num <= 999 && num >=100) ) {
			System.out.println("Triple digit.");
		} else {
			System.out.println("Error");
		}
	}
}
