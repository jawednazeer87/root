package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment16 {
    /*
   16) wap to reverse an array
    */
    static Logger log = LoggerFactory.getLogger(Assignment16.class);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRev = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            arrRev[j] = arr[i];
        }
        log.info("Arrays.toString(arrRev) = " + Arrays.toString(arrRev));
    }
}
