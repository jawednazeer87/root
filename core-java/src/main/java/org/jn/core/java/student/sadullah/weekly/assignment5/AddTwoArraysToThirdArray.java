package org.jn.core.java.student.sadullah.weekly.assignment5;

public class AddTwoArraysToThirdArray {
	static int [] addTwoArrays(int a[], int b [] ) {
		int sum = 0;
		int c [] = new int [b.length];
		
		for (int i = 0; i < b.length; i++) {
			sum = a[i] + b[i];
			c [i] = sum;
			sum = 0;
		}
		return c;
	}
	
	
	public static void main(String[] argrs) {
		int a [] = {1, 2, 3, 4, 5};
		int b [] = {6, 7, 8, 9, 10};
		
		int c [] = addTwoArrays(a, b);
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("c[" +i +"] = " +c[i]);
		}
	}
}
