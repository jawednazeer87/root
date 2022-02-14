package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment44 {
    /*
 44)	wap to divide each element of an array by 2.
		Suppose given array is [10, 19, 2, 7] -> our program will divide each element by 2
		then answer should be 10/2, 19/2, 2, 7/2 = 5, 9, 3, 1
    */
    static Logger log = LoggerFactory.getLogger(Assignment44.class);
    public static void main(String[] args) {
        int[] arr = {10, 19, 2, 7};
        for (int i = 0; i < arr.length; i++) {
            arr[i] /= 2;
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
