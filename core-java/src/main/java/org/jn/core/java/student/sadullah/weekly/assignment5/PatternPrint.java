package org.jn.core.java.student.sadullah.weekly.assignment5;

public class PatternPrint {
	static void printIncrStar(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] argrs) {
		printIncrStar(10);
	}
}
