package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment5;

public class PrintOddNumsFromArray {

	static void printOddArray(int[] arr) {
		for(int x:arr) {
			if(x%2!=0) {
				System.out.print(x + " ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {-1,2,3,-65,34,-9};
		printOddArray(arr);
	}

}