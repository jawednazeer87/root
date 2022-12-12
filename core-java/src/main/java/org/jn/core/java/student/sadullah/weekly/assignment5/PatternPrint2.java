package org.jn.core.java.student.sadullah.weekly.assignment5;

public class PatternPrint2 {
	static void printStarFromRight(int row) {
		for (int i = 0; i < row; i++) {
			// Print spaces
			for (int j = 0; j < row - i; j++) {
				System.out.print(" ");
			}
			// Print stars
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			// Move to the next line
			System.out.println();
		}
	}
	
	public static void main(String[] argrs) {
		printStarFromRight(8);
	}
}
