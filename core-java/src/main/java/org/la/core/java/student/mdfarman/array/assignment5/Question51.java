package org.la.core.java.student.mdfarman.array.assignment5;

import java.util.Arrays;

public class Question51 {
//		51) wap to count all prime numbers of an array?
//	Suppose given array is [100, 19, 2, 7, 50] -> 19, 2, 7 are prime numbers so the count = 3


	public static void main(String[] args) {
		int[] arr = {100, 19, 2, 7, 50};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1 || arr[i]==2){
                count++;
            }
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
		
	}
}
