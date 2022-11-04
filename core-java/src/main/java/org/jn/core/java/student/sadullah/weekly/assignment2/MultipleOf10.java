package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number to find out whether it is a multiple of 10.");
		
		int num = newscan.nextInt();
		
		if (num%10 == 0) {
			System.out.println("The number is a multiple of 10.");
		} else {
			System.out.println("The number is not a multiple of 10.");
		}
	}
}
