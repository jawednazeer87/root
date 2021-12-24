package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment46 {
    /*
 46)	wap to add all odd numbers of an array and print the sum
		Suppose given array is [10, 19, 2, 7] -> sum=26 which is sum of 19 and 7, both are odd
    */
    static Logger log = LoggerFactory.getLogger(Assignment46.class);
    public static void main(String[] args) {
        int[] arr = {10, 19, 2, 7};
        int sumOfOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                sumOfOdd+=arr[i];
            }
        }
        log.info("sum = " + sumOfOdd);
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
