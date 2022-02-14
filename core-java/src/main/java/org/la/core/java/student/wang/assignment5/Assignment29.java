package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment29 {
    /*
 29) wap to insert an element (specific position) into an array?
    */
    static Logger log = LoggerFactory.getLogger(Assignment29.class);
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 7};
        int[] resultArr = new int[arr.length + 1];
        int element = 10;
        int index = 3;
        for (int i = 0; i < arr.length + 1; i++) {
            if (i < index) {
                resultArr[i] = arr[i];
            } else if (i == index) {
                resultArr[i] = element;
            } else {
                resultArr[i] = arr[i - 1];
            }

        }
        log.info("Arrays.toString(resultArr) = " + Arrays.toString(resultArr));
    }
}