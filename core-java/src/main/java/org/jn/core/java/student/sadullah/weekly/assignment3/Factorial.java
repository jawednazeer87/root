package org.jn.core.java.student.sadullah.weekly.assignment3;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		int fact =1;
		int a [] = {10, 4, 9};
		
		for (int i = 0; i < a.length; i++) {
			fact = 1;
			for (int j = 1; j <= a[i]; j++) {
				fact *= j;
			}
			System.out.println("Factorial of " +a[i] + " is " +fact);
		}
	}
}
