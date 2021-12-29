package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;

public class Question49 {
//		49)	what ArrayIndexOutOfBoundsException ?	- theory, search in google


	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		arr[5] = 5;     // ArrayIndexOutOfBoundsException
		
		System.out.println(Arrays.toString(arr));
			
	}
}
