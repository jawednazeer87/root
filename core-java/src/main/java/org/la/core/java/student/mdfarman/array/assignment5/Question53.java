package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;

public class Question53 {
//		53)	wap to find whether an array of characters having 'a' or not?
//	Suppose given array is ['a', '5', '7', 'p'] -> this array has 'a'
//	Suppose given array is ['A', '5', '7', 'p'] -> this array doesn't have 'a'

	public static void main(String[] args) {
		char[] arr = {'a', '5', '7', 'p'};
		boolean flag = false;
        
		for(int i = 0 ; i < arr.length; i++) {
        	if(arr[i] == 'a') {
        		flag = true;
        		break;
        	}
        }
        if(flag == true) {
        	System.out.println("this array has 'a' ");
        }
        else {
        	System.out.println("this array doesn't have 'a'");
        }
        
        
		
	}
}
