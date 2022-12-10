package org.jn.core.java.student.sadullah.weekly.assignment5;

public class SmallestNumberInArray {
	static int smallest (int a[]) {
		int smallest = 0;
		for (int i = 0; i < a.length; i++) {
			if (smallest>a[i]) {
				smallest = a[i];
			}
		}
		return smallest;
	}
	
	
	public static void main(String[] argrs) {
		int a [] = {1, 2, 900, -20, 5602, 0, -12};
		
		int smallest = smallest(a);
		
		System.out.println("The smallest value in the array a = " +smallest);
	}
}
