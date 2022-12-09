package org.jn.core.java.jawed.method;

public class SumOfAllElementsInArray {
	static int sum(int a []) {
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] argrs) {
		int a [] = {500, 4, -12, 90, -120, 29, 100};
		
		int res = sum(a);
		
		System.out.println("The sum of all the elements in the array is: " +res);
	}
}
