package org.jn.core.java.student.sadullah.weekly.assignment5;

public class AverageOfElementsInArray {
	static float average(int a []) {
		float average = 0;
		for (int i = 0; i < a.length; i++) {
			average += a[i];
		}
		average = average/a.length;
		return average;
	}
	
	public static void main(String[] argrs) {
		int a [] = {26, 40, 70, 80, 90, 44, 12, 34};
		float average = average(a);
		
		System.out.println("The average of the elements within the array a = " +average);
	}
}
