package org.jn.core.java.student.sadullah.weekly.assignment5;

public class PatternPrint3 {
	static void printStarReverse(int row){
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] argrs) {
		printStarReverse(10);
	}
}
