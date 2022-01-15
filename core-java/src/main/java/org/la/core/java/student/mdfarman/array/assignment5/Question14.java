package org.la.core.java.student.mdfarman.array.assignment5;

public class Question14 {
//	14) wap to find greatest number from any array


	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int greatest = arr[0];
		
		for (int i = 0 ; i<arr.length;i++) {
			if(greatest<arr[i]) {
				greatest = arr[i];
			}
		}
		System.out.println(greatest);
	}
}
