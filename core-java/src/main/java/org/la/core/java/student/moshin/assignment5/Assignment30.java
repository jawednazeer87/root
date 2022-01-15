package org.la.core.java.student.moshin.assignment5;

public class Assignment30 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = {1,3,5,7,9,11,13};
		int i,j;
		for(i=0; i<arr1.length;i++) {
			for(j=0; j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
				System.out.println(arr2[j]);
				}
			}	
		}	
	
		
	}
}
