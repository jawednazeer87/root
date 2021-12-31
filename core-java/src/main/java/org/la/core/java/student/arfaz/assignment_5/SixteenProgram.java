package org.la.core.java.student.arfaz.assignment_5;

import java.util.Arrays;

//  wap to reverse an array

public class SixteenProgram {

	public static void main(String[] args) {

		int arr[] = new int[4], min=0,n=0;
		
		for(int i=0,j=1;i<arr.length&&j<=arr.length;i++,j++) {
        	arr[i] = j;
//        	System.out.println("Array = "+arr[i]);
            	
        }
		for(int j=arr.length-1;j>=0;j--)
			System.out.print(arr[j]+" ");
	}

}
