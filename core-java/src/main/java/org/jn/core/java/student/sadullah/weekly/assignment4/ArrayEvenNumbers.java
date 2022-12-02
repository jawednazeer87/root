package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayEvenNumbers {

	public static void main(String[] args) {
		int a [] = new int [70];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("a[" + i + "] = " +a[i]);
			}
		}
	}
}
