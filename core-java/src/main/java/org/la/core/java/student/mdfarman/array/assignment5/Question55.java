package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;

public class Question55 {
//		55) wap to print all ascii value of character array
//	 Suppose given array is ['a', '5', '7', 'p'] -> answer would be : 97, 53, 55, 112

	public static void main(String[] args) {
		char[] arr = {'a', '5', '7', 'p'};
        
		for(int i = 0 ; i < arr.length; i++) {
        	System.out.println(arr[i]+" : "+(int)arr[i]);
        }
		
	}
}
