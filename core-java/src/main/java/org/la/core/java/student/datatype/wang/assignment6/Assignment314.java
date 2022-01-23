package org.la.core.java.student.datatype.wang.assignment6;

import java.util.Arrays;

public class Assignment314 {
    /*
314
	37 wap to separate even and odd numbers of a given array of integers. Put all even numbers first, and
		then odd numbers?
*/
    public static void evenFirstOddLast(int[] arr) {
        int[] newArr = new int[arr.length];

        int i = 0;
        for (int element : arr) {
            if (element % 2 == 0) {
                newArr[i++] = element;
            }
        }
        for (int element : arr) {
            if (element % 2 != 0) {
                newArr[i++] = element;
            }
        }
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        evenFirstOddLast(arr1);
    }
}