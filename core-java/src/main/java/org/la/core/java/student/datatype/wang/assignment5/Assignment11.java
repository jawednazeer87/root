package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment11 {
    /*
   11) wap to copy one array into other array
    */
    public static void main(String[] args) {
        int[] arr = {2, 3, 11};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=arr[i];
        }
        System.out.println("Arrays.toString(arr1) = " + Arrays.toString(arr1));
    }
}
