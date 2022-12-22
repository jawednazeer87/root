package org.jn.core.java.student.sadullah.weekly.assignment5;

public class PatternPrint2 {
	static void printStarFromRight(int row) {
		for (int i = 0; i < row; i++) {
			for (int j =row - i; j > 0 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] argrs) {
		printStarFromRight(5);
	}
}
