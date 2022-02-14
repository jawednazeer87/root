package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment10 {
    /*
   10) wap to print array in reverse order
    */
    static Logger log = LoggerFactory.getLogger(Assignment10.class);
    public static void main(String[] args) {
        int[] arr = {2, 3, 11};
        for (int i = arr.length - 1; i >= 0; i--) {
            log.info("arr[i] = " + arr[i]);
        }
    }
}
