package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment16 {
    /*
   16) wap to reverse an array
    */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRev = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arrRev[j] = arr[i];
        }
        System.out.println("Arrays.toString(arrRev) = " + Arrays.toString(arrRev));
    }
}
