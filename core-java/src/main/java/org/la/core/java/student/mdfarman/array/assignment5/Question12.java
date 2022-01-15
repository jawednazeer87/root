package org.la.core.java.student.mdfarman.array.assignment5;

public class Question12 {
//	12) wap to copy an array to another array in reverse order


	public static void main(String[] args) {
		int arr1[] = {4,5,7,8,4,28,8,7,-54};
		int arr2[] = new int[arr1.length];
		
		for (int i = 0; i<arr1.length; i++) {
			arr2[i] = arr1[arr1.length - i - 1];
		}
		
		for (int i = 0 ; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
}
