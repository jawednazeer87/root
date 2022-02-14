package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment15 {
    /*
   15) wap to find smallest number among array element
    */
    static Logger log = LoggerFactory.getLogger(Assignment15.class);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        log.info("min = " + min);
    }
}
