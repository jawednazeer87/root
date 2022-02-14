package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment13 {
    /*
   13) wap to find some of an array element
    */
    static Logger log = LoggerFactory.getLogger(Assignment13.class);

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            log.info("arr[" + i + "] = " + arr[i]);
        }
    }
}
