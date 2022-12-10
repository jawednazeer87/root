package org.jn.core.java.student.sadullah.weekly.assignment5;

public class PercentageOf5Sub {
	static double percent(int a, int b, int c, int d, int e) {
		int total = a + b + c + d + e;
		
		return total/500.0*100;
	}
	
	public static void main(String[] argrs) {
		double percentage = percent(98, 90, 75, 85, 80);
		
		System.out.println("Total percentage: " +percentage);
	}
}
