package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class BetweenNegative100And15 {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter number to find out if it lies between -100 to 50.");
		
		int num = newscan.nextInt();
		
		if (num > -100 && num < 50) {
			System.out.println("The number is within the given limits");
		} else {
			System.out.println("The number is not within the given limits.");
		}
	}
}
