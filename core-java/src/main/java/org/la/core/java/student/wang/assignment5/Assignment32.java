package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment32 {
    /*
 32) wap to find the second largest element in an array?
    */
    static Logger log = LoggerFactory.getLogger(Assignment32.class);
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 3, 6, 1, 2, 3};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                 temp = arr[i];
                 arr[i]= arr[j];
                 arr[j]=temp;
                }
            }
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
        log.info("second largest number in array is  " + arr[arr.length - 2]);
    }
}