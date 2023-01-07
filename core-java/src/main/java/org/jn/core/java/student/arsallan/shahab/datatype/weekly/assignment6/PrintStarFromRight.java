package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class PrintStarFromRight {

	public static void main(String[] args) {
		printStar(6);
	}
	
	static void printStar(int x) {
		for(int i=0; i<x;i++) { //i=4 x=6
			for(int k=0;k<(x-i-1);k++ ) { //6-4-1 spaces
				System.out.print(" ");
			}
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

}
