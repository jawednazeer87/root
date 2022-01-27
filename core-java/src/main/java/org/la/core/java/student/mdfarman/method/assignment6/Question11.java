package org.la.core.java.student.mdfarman.method.assignment6;


public class Question11 {

	//		int smallest(int[])
//	find smallest element of an array and return that smallest value

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int smll= smallest(arr);
		System.out.println(smll);
	}

	public static int smallest(int[] arr) {
		int small = arr[0];

		for(int i:arr) {
			if (small>i) {
				small = i;
			}
		}
		return small;
	}


}
