package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment5;

public class PrintPositiveNumsFromArray {
	
	static void printPositiveArray(int[] arr) {
		for(int x:arr) {
			if(x>0) {
				System.out.print(x + " ");
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {-1,2,3,-65,34,-9};
		printPositiveArray(arr);
	}

}