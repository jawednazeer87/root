package org.la.core.java.student.arfaz.assignment_5;

import java.util.Arrays;

// wap to find greatest number from any array 

public class ForteenProgram {

	public static void main(String[] args) {

		int arr[] = new int[5], max=0;
		
		for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
            	
        }
		Arrays.sort(arr);
		 
		 System.out.println(arr[arr.length-1]);
	}

}
