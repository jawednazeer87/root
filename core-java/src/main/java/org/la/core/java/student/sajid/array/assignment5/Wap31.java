package org.la.core.java.student.sajid.array.assignment5;

public class Wap31 {

	public static void main(String[] args) {
		// wap to remove duplicate elements from an array?
		
		int[] arr1 = {1,2,3,4,5,6,7,7,6,6,4,2,2};
		int arrayLength = arr1.length;
		for(int i=0; i<arr1.length;i++) {
			for(int n=i+1; n<arrayLength;n++) {
				if(arr1[i] == arr1[n]) {
					arr1[n] = arr1[arrayLength-1];
					arrayLength--;
					n--;
				} 
			}	
		}
		for(int i=0; i<arrayLength;i++) {
			System.out.println(arr1[i]);
		}

	}

}
