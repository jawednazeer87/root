package org.la.core.java.student.datatype.wang.assignment6;

import java.util.Arrays;

public class Assignment312 {
    /*
312
	25 wap to calculate the average value of array elements?
*/
    public static double average(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double average = sum / arr.length;
        return average;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        double average = average(arr1);
        System.out.println("average = " + average);
    }
}