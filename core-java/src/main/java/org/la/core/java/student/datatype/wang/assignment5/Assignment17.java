package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment17 {
    /*
   17) wap to copy two arrays into one array
    */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 1, 1};
        int[] arrNew = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arrNew[j++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrNew[j++] = arr2[i];
        }
        System.out.println("Arrays.toString(arrNew) = " + Arrays.toString(arrNew));
    }
}
