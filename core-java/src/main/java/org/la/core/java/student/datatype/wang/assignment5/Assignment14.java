package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment14 {
    /*
   14) wap to find greatest number from any array
    */
    static Logger log = LoggerFactory.getLogger(Assignment14.class);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        log.info("max = " + max);
    }
}
