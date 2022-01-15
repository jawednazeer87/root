package org.la.core.java.student.sajid.array.assignment5;

public class Wap30 {

	public static void main(String[] args) {
		// wap to find the common elements between two arrays?
		
		int arr[] = {2,4,6,8,10};
		int arr1[] = {2,4,6,7,9};
		
		for (int i=0;i < arr.length ; i++) {		
			System.out.println("arr["+i+"]: "+arr[i]);
		}		
		
		for (int i=0;i < arr1.length ; i++) {		
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}	
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr1[i]) {
				System.out.println("Common element in the arrays: "+arr[i]);
			}					
		}

	}

}
