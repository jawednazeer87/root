package org.jn.core.java.student.arsallan.shahab.datatype.weekly.assignment6;

import java.util.Arrays;

public class CopyArray {
	
	static int[] copyArr(int[] arr) {
		int arrLength = arr.length;
		
//		int[] newArr = new int[arrLength];
		
//		for(int i=0;i<arrLength;i++) {
//			newArr[i] = arr[i];
//		}
		
		return Arrays.copyOf(arr, arrLength);
		
	}

	public static void main(String[] args) {
		 int[] arr = {1,2,3,4,5,6};
		 
		 int[] copyArray = copyArr(arr);
		 System.out.println(copyArray+" copy & real "+arr);
	}

}
