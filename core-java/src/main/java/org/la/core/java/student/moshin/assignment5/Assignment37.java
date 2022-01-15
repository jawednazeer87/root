package org.la.core.java.student.moshin.assignment5;

public class Assignment37 {
	
	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = new int[arr1.length];
		int j = 0;
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]%2 == 0) 
				arr2[j++] = arr1[i];			
		}
		
		for(int i=0; i<arr1.length;i++) {
			if(arr1[i]%2 != 0) 
				arr2[j++] = arr1[i];			
		}		
		
		for(int i=0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
	}
}