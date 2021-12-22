package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment25 {
    /*
  25)wap to calculate the average value of array elements?
    */
    public static void main(String[] args) {
        int[] arr = {4, 2, 3};
        int length = arr.length, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int aveValue = sum / length;
        System.out.println("aveValue = " + aveValue);
    }
}