package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

public class PrintOddNum {

	public static void main(String[] args) {
		int[] arr = {2,-1,4,-7,-86};
		printOdd(arr);

	}
	
	static void printOdd(int[] arr) {
		for(int x:arr) {
			if(x%2!=0) {
				System.out.println(x);
			}
		}
	}

}
