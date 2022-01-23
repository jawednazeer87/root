package org.la.core.java.student.datatype.wang.assignment6;

import java.util.Arrays;

public class Assignment309 {
    /*
309
	16) wap to reverse an array
*/
    public static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];
        int i = arr.length-1;
        for (int element : arr) {
           reverse[i--]=element;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -5};
        int[] reverse = reverse(arr);
        System.out.println("Arrays.toString(reverse) = " + Arrays.toString(reverse));
    }
}