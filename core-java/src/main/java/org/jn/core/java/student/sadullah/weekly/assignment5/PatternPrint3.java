package org.jn.core.java.student.sadullah.weekly.assignment5;

public class PatternPrint3 {
	static void printStarReverse(int row) {
		for (int i = 0; i < row; i++) {
			for (int j = row; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] argrs) {
		printStarReverse(5);
	}
}
