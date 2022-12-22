package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment5;

public class PrintGreatestFromArray {

	static int GreatestNumFromArray(int[] arr) {
		int greatest=0;
		for(int x:arr) {
			if(x>greatest) {
				greatest = x;
			}
		}
		return greatest;
	}

	public static void main(String[] args) {
		int arr[] = {-1,2,3,1,34,-9};
		System.out.println("greatest num from array is "+ GreatestNumFromArray(arr));
	}

}
