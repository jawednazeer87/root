package org.jn.core.java.student.sadullah.weekly.assignment3;
import java.util.Scanner;

public class SumOfAllOddNumbersTon {

	public static void main(String[] args) {

		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter n to calculate sum of all odd numbers till n. (Only positive numbers)");
		
		int i = newscan.nextInt();
		
		printNatural(i);
	}
	static void printNatural(int i) {
		int sum = 0;
		
		for (int j = 0; j <= i; j++) {
			if (j % 2 != 0) {
				sum += j;
			}
		}
		System.out.println(sum);
	}
}