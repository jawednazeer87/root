package org.la.core.java.student.wang.assignment6;

import java.util.Arrays;

public class Assignment311 {
    /*
311
	18) wap to add two array elements n copy into third array
*/
    public static int[] copyTwoArrIntoOne(int[] arr1, int[] arr2) {
        int[] resultArr = new int[arr1.length + arr2.length];
        int i = 0;
        for (int element : arr1) {
            resultArr[i++] = element;
        }
        for (int element : arr2) {
            resultArr[i++] = element;
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, -3, 4, -5};
        int[] arr2 = {1, 1, 1};
        int[] result = copyTwoArrIntoOne(arr1, arr2);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
}