package org.jn.core.java.student.sadullah.weekly.assignment5;

public class GreatestElementInArray {
	static int greatest(int a[]) {
		int greatest = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]>greatest) {
				greatest = a[i];
			}
		}
		return greatest;
	}
	
	public static void main(String[] argrs) {
		int a [] = {25, 78, 912, 1000, 638, 8, 0};
		
		int greatest = greatest(a);
		
		System.out.println("The greatest element in this array = " +greatest);
	}
}
