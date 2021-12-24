package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment57 {
    /*
   57	33.	wap to print all upper case alphabets.
    */
    static Logger log = LoggerFactory.getLogger(Assignment57.class);
    public static void main(String[] args) {
        char[] arr = new char[26];
        int j = 0;

        for (char i = 'A'; i <= 'Z'; i++) {
            arr[j++] = i;
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
