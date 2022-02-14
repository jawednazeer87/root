package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment09 {
    /*
   09) wap to print number not divisible by given number from an array
    */
    static Logger log = LoggerFactory.getLogger(Assignment09.class);
    public static void main(String[] args) {
        int[] arr = {2, 3, 11};
        int num = 60;
        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] != 0) {
                log.info(num + " is not divisible by one given number from an array");
                break;
            }
        }

    }
}
