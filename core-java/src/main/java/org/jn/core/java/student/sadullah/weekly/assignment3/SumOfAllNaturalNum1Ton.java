package org.jn.core.java.student.sadullah.weekly.assignment3;
import java.util.Scanner;

public class SumOfAllNaturalNum1Ton {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number you want to find sum of till. (Positive numbers only)");
		
		int i = newscan.nextInt();
		
		printNatural(i);
	}
	static void printNatural(int i) {
		
		int sum = 0;
		
		for (int j = 1; j <= i; j++) {
			sum += j;
		}
		System.out.println(sum);
		
	}
}
