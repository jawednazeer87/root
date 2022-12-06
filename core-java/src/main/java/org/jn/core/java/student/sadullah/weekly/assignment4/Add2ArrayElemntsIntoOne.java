package org.jn.core.java.student.sadullah.weekly.assignment4;

public class Add2ArrayElemntsIntoOne {

	public static void main(String[] args) {
		int a [] = {1, 2, 3, 4, 5};
		int b [] = {6, 7, 8, 9, 10};
		
		int c [] = new int [b.length];
		
		int sum = 0;
		
		for (int i = 0; i < b.length; i++) {
			sum = a[i] + b[i];
			c[i] = sum;
			sum = 0;
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] = " +c[i]);
		}
	}
}
