package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment26 {
    /*
  26) wap to test if an array contains a specific value?
    */
    static Logger log = LoggerFactory.getLogger(Assignment26.class);
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 7};
        int element = 7;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                log.info("the array contains the element " + element);
            }
        }
    }
}