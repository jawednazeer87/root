package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment40 {
    /*
 40)	wap to add 5 to each element of an array
    */
    static Logger log = LoggerFactory.getLogger(Assignment40.class);
    public static void main(String[] args) {
        int[] arr = {20, 21, 30, 41, 50, 51, 50};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
