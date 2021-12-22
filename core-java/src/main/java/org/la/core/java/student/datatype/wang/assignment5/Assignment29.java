package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment29 {
    /*
 29) wap to insert an element (specific position) into an array?
    */
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 7};
        int[] resultArr = new int[arr.length + 1];
        int element = 10;
        int index = 3;
        for (int i = 0; i < arr.length + 1; i++) {
            if (i < index) {
                resultArr[i] = arr[i];
            } else if (i == index) {
                resultArr[i] = element;
            } else {
                resultArr[i] = arr[i - 1];
            }

        }
        System.out.println("Arrays.toString(resultArr) = " + Arrays.toString(resultArr));
    }
}