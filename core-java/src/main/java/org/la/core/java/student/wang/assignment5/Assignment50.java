package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment50 {
    /*
 50)	wap to find the largest and smallest number in an integer array
		Suppose given array is [100, 30, -20, 0] -> largest=100, smallest=-20
    */
    static Logger log = LoggerFactory.getLogger(Assignment50.class);
    public static void main(String[] args) {
        int[] arr = {100, 30, -20, 0};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        log.info("max = " + max);
        log.info("min = " + min);
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
