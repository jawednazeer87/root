package org.la.core.java.student.mdfarman.method.assignment6;


public class Question10 {

	//		int greatest(int[])
	//	find greatest element of an array and return that greatest value

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int gre= greatest(arr);
		System.out.println(gre);
	}

	public static int greatest(int[] arr) {
		int gre = arr[0];

		for(int i:arr) {
			if (gre<i) {
				gre = i;
			}
		}
		return gre;
	}


}
