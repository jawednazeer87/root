package org.la.core.java.student.datatype.wang.assignment6;

import java.util.Arrays;

public class Assignment106 {
/*
106
void copy(int[], int[])
		copy first array to second array
 */
    public void copy(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] arr = new int[length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr[j++] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[j++] = arr2[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
