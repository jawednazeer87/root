package org.jn.core.java.student.sadullah.weekly.assignment4;
import java.util.Scanner;

public class ArrayDivisibleByAGivenNumber {

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		
		System.out.println("Enter a number to find which numbers are not divisible with the number from the array.");
		
		int in = newscan.nextInt();
		
		int a [] = new int [50];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % in != 0) {
				System.out.println("a[" + i + "] = " + a[i]);
			}
		}
	}
}
