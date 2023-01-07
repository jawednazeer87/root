package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class PrintIncrStar {

	public static void main(String[] args) {
		IncPatt(5);
	}
	
	static void IncPatt(int x) {
		for(int i=0; i<x;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}

}
