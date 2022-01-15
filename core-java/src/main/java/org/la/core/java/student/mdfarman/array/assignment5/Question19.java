package org.la.core.java.student.mdfarman.array.assignment5;


public class Question19 {
//		19) wap to find duplicate elements in an array?

	public static void main(String[] args) {
		
		int arr[] = {6,1,4,7,8,5,4,65,7,8,5,4,7,8};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1 ; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
			
	}
}
