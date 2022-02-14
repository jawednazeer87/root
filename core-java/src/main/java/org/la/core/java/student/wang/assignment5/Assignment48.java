package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment48 {
    /*
 48)	wap to count all 2's of an int array
		Suppose given array is [10, 19, 2, 7] -> number of 2's here one
		Suppose given array is [1, 19, 1, 7, 1, 3] -> number of 2's here 0
    */
    static Logger log = LoggerFactory.getLogger(Assignment48.class);
    public static void main(String[] args) {
        int[] arr = {10, 19, 2, 7};
        int countOfTwo = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                countOfTwo++;
            }
        }
        log.info("countOfOne = " + countOfTwo);
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
