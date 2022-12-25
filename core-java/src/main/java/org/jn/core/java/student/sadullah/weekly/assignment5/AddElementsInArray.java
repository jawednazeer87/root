package org.jn.core.java.student.sadullah.weekly.assignment5;

public class AddElementsInArray {
	static int sum(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	
	public static void main(String[] argrs) {
		int a [] = {500, 4, -12, 90, -120, 29, 100};
		int total = sum(a);
		
		System.out.println("The total of the elements within array a = " +total);
	}
}
