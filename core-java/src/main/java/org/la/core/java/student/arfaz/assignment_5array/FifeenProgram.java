package org.la.core.java.student.arfaz.assignment_5array;

import java.util.Arrays;

// wap to find smallest number among array element

public class FifeenProgram {

	public static void main(String[] args) {

		int arr[] = new int[4], min=0,n=0;
		
		for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
        	System.out.println("Array = "+arr[i]);
            	
        }
		 Arrays.sort(arr);
		 System.out.println(arr[0]);
	}

}
