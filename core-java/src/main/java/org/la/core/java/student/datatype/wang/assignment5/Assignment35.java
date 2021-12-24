package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment35 {
    /*
 35)wap to check if an array of integers without 0 and -1?
    */
    static Logger log = LoggerFactory.getLogger(Assignment35.class);

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 4, 5, -1, 6, 2};
        boolean has0And1 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == -1) {
                has0And1 = true;
                break;
            }
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
        log.info("has0And1 : " + has0And1);
    }
}