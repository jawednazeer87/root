package org.jn.core.java.student.sadullah.weekly.assignment2;
import java.util.Scanner;

public class DivisibleBy7 {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number to find if it is divisible by 7.");
		
		int num = newscan.nextInt();
		
		if (num % 7 == 0) {
			System.out.println("The number is divisible by 7.");
		} else {
			System.out.println("The number is not divisible by 7.");
		}
	}
}
