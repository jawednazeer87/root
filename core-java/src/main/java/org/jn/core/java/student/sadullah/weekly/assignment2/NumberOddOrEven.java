package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class NumberOddOrEven {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number to find out whether odd or even.");
		
		int num = newscan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("The number is an even number.");
		} else {
			System.out.println("The number is an odd number.");
		}
	}
}
