package org.jn.core.java.jawed.array;

public class TwoDimensArray {

	public static void main(String[] args) {
		int[][] array = new int[3][4];
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
