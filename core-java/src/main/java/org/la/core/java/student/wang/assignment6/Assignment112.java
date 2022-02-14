package org.la.core.java.student.wang.assignment6;

import java.util.Arrays;

public class Assignment112 {
    /*
    112
        int[] addTwoArrays(int[], int[]) - all array of same size
            add two supplied arrays elements and then copy the some of each element to 3rd array and
            return 3rd array.
     */
    public int[] addTwoArrays(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] newArr = new int[length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            newArr[j++] = arr1[i];
        }
        for (int k = 0; k < arr2.length; k++) {
            newArr[j++] = arr2[k];
        }
        return newArr;
    }

    public static void main(String[] args) {
        Assignment112 assignment112 = new Assignment112();
        int[] arr1 = {1, 11, 111};
        int[] arr2 = {2, 22, 222};
        int[] newArr = assignment112.addTwoArrays(arr1, arr2);
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));
    }
}
