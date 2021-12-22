package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment31 {
    /*
 31) wap to remove duplicate elements from an array?
    */
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 3, 6, 1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = null;
                }
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}