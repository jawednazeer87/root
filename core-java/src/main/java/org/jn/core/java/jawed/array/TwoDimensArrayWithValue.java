package org.jn.core.java.jawed.array;

public class TwoDimensArrayWithValue {

	public static void main(String[] args) {
		int[][] array = {
				{1, 2, 3},
				{100, 200, 300},
				{17, 19, 23},
				{-30, -1, -890}
		};
		printArray(array);
	}
	
	private static void printArray(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length ; c++) {
				System.out.print("a["+r+"]["+c+"]="+a[r][c]+", ");
			}
			System.out.println("");
		}
	}

}
