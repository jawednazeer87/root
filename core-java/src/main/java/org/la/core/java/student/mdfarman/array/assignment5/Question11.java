package org.la.core.java.student.mdfarman.array.assignment5;

public class Question11 {
//	11) wap to copy one array into other array


	public static void main(String[] args) {
		int arr1[] = {4,5,7,8,4,28,8,7,-54};
		int arr2[] = new int[arr1.length];
		for (int i = 0 ; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for (int i = 0 ; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
}
