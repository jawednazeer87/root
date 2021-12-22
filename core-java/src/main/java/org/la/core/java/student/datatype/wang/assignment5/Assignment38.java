package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment38 {
    /*
 38) Find largest and smallest elements of an array? 
    */
    public static void main(String[] args) {
        int[] arr = {20, 21, 30, 41, 50, 51, 50};
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
