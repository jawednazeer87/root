package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment04 {
    /*
    04) wap to print only odd numbers from an array
    */
    static Logger log = LoggerFactory.getLogger(Assignment04.class);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                log.info("arr[" + i + "] = " + arr[i] + " is odd number");
            }
        }

    }
}
