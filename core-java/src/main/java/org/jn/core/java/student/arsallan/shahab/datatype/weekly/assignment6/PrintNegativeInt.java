package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class PrintNegativeInt {

	public static void main(String[] args) {
		int[] arr = {2,-1,4,-7,-86};
		printNegative(arr);

	}
	
	static void printNegative(int[] arr) {
		for(int x:arr) {
			if(x<0) {
				System.out.println(x);
			}
		}
	}

}
