package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment12 {
    /*
   12) wap to copy an array to another array in reverse order
    */
    public static void main(String[] args) {
        int[] arr = {2, 3, 11};
        int[] arr1 = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arr1[j] = arr[i];
        }
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
    }
}
