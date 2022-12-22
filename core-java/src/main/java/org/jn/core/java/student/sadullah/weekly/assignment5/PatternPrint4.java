package org.jn.core.java.student.sadullah.weekly.assignment5;

public class PatternPrint4 {
	static void printStarReverseRight(int row) {
		for (int i = row; i >= 0; i--) {
			for (int j = row; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] argrs) {
		printStarReverseRight(5);
	}
}
