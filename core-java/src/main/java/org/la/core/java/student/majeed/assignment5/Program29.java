package org.la.core.java.student.majeed.assignment5;

public class Program29 {

	public static void main(String[] args) {
		//29) wap to insert an element (specific position) into an array?
	    		
		int[] arr1 = {1,2,3,4,5,6,7};
		int[] arr2 = new int[arr1.length+1];
		int specificValue = 9, specificPos = 4, i,j,k=0;
		for(i=0; i<arr1.length;i++) {
			if(i == specificPos) {
				arr2[k] = specificValue;
				k++;
				arr2[k] = arr1[i];
			} else {
				arr2[k] = arr1[i];
			}
			k++;
		}	
		for(j=0; j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}		
		
	}
}
