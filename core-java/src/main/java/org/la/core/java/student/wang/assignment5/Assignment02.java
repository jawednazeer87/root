package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment02 {
    /*
    02) wap to create and print array using loop
    */
    static Logger log = LoggerFactory.getLogger(Assignment02.class);

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i = 0; i < arr.length ; i++) {
            log.info("arr["+i+"] = " + arr[i]);
        }

    }
}
