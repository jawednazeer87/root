package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment36 {
    /*
 36) wap to remove the duplicate elements of a given array and return the new length of the
		array.Sample array: [20, 20, 30, 40, 50, 50, 50]
		After removing the duplicate elements the program should return 4 as the new length of the array?
    */
    static Logger log = LoggerFactory.getLogger(Assignment36.class);
    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50}; //20,30,40,50

        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j - 1]) {
                arr[j++] = arr[i];
            }
        }

        log.info("the new length of the array : "+j);
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));

    }

}
