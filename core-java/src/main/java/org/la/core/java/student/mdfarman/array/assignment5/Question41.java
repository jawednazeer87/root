package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;
import java.util.Scanner;


public class Question41 {
//	41) wap to convert an array of characters from upper case to lower case, e.g if arr[] = {'a', 'b', 'C'} 
//	then after conversion final array should be arr[] = {'A', 'B', 'C'}

	public static void main(String[] args) {
		char[] arr = {'a', 'b', 'c'};
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 32;
        }
        System.out.println(Arrays.toString(arr));
			
	}
}
