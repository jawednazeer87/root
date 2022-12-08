package org.jn.core.java.student.sadullah.weekly.assignment4;

public class ArrayElementsAverage {
	public static void main(String[] argrs) {
		int a [] = {26, 40, 70, 80, 90, 44, 12, 34};
		float sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
				
		float average = sum / a.length;
		
		System.out.println("The average of the elemts within the array are: " +average);
	}
}
