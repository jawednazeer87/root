package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment45 {
    /*
 45) wap to add all even numbers of an array and print the sum
		Suppose given array is [10, 19, 2, 7] -> sum=12 which is sum of 10 and 2, both are even
    */
    static Logger log = LoggerFactory.getLogger(Assignment45.class);
    public static void main(String[] args) {
        int[] arr = {10, 19, 2, 7};
        int sumOfEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                sumOfEven+=arr[i];
            }
        }
        log.info("sum = " + sumOfEven);
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
