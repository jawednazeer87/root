package org.la.core.java.student.moshin.assignment5;

public class Assignment28 {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = new int[arr1.length-1];
		int specificValue = 6, i,j,k=0;
		for(i=0; i<arr1.length;i++) {
			if(arr1[i] != specificValue) {
				arr2[k] = arr1[i];
				k++;
			}
		}	
		for(j=0; j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}		
		
	}
}
