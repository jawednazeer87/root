package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;

public class Question52 {
//		52)	wap to add all elements of an array and check wether the sum is a prime number or not?
//	Suppose given array is [10, 19, 2, 7] -> sum=38 is not a prime number
//	Suppose given array is [10, 8, 2, 9] -> sum=29 is a prime number

	public static void main(String[] args) {
		int[] arr = {10, 8, 2, 9};
        int sum = 0;

        for(int i = 0 ; i < arr.length; i++) {
        	sum += arr[i];
        }
        
        boolean flag = false;
        for(int i = 2; i<sum ; i++) {
        	if(sum%i==0) {
        		flag = true;
        		break;
        	}
        }
        if(flag == true){
        	System.out.println("Not Prime number");
        }
        else {
        	System.out.println("Prime number");
        }
		
	}
}
