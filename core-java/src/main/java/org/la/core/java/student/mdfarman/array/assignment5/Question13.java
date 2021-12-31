package org.la.core.java.student.mdfarman.array.assignment5;

public class Question13 {
//	 13) wap to find sum of an array element


	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		for (int i = 0 ; i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
}
