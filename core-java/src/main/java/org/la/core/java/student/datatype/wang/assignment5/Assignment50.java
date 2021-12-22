package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment50 {
    /*
 50)	wap to find the largest and smallest number in an integer array
		Suppose given array is [100, 30, -20, 0] -> largest=100, smallest=-20
    */
    public static void main(String[] args) {
        int[] arr = {100, 30, -20, 0};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
