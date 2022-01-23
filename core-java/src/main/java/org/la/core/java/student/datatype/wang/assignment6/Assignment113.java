package org.la.core.java.student.datatype.wang.assignment6;

import java.util.Arrays;

public class Assignment113 {
    /*
   113
	int[] copyArrays(int[], int[]) - target array size = size of arr1 + size of arr2
		copy first array and second array to two third array.
     */
    public int[] copyArrays(int[] arr1, int[] arr2) {
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
        Assignment113 assignment113 = new Assignment113();
        int[] arr1 = {1, 11, 111};
        int[] arr2 = {2, 22, 222};
        int[] newArr = assignment113.copyArrays(arr1, arr2);
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));
    }
}
