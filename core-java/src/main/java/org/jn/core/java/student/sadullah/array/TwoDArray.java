package org.jn.core.java.student.sadullah.array;

public class TwoDArray {
	static void printarray(int a [] []) {
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[r].length; c++) {
				System.out.print("a[" +r +"] " +"[" +c +"] = " +a[r][c] +" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] argrs) {
		int twoDArray [] [] = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		printarray(twoDArray);
 	}
}
