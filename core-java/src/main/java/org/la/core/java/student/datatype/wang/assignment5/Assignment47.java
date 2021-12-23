package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment47 {
    /*
 47)	wap to count all 1's of an int array
		Suppose given array is [10, 19, 2, 7] -> number of 1's here zero
		Suppose given array is [1, 19, 1, 7, 1, 3] -> number of 1's here 3
    */
    static Logger log = LoggerFactory.getLogger(Assignment47.class);
    public static void main(String[] args) {
        int[] arr = {10, 19, 2, 7};
        int countOfOne = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOfOne++;
            }
        }
        log.info("countOfOne = " + countOfOne);
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
