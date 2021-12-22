package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment33 {
    /*
 33) wap to find the second smallest element in an array?
    */
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 3, 6, 1, 2, 3};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                 temp = arr[i];
                 arr[i]= arr[j];
                 arr[j]=temp;
                }
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("second smallest number in array is  " + arr[1]);
    }
}