package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment39 {
    /*
 39)	wap to subtract -1 from each element of an array
    */
    public static void main(String[] args) {
        int[] arr = {20, 21, 30, 41, 50, 51, 50};
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 1;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
