package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment35 {
    /*
 35)wap to check if an array of integers without 0 and -1?
    */
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 4, 5, -1, 6, 2};
        boolean has0And1 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == -1) {
                has0And1 = true;
                break;
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("has0And1 : " + has0And1);
    }
}