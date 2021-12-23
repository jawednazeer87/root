package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment56 {
    /*
    56	32. wap to print all lower case alphabets.
    */
    static Logger log = LoggerFactory.getLogger(Assignment56.class);
    public static void main(String[] args) {
        char[] arr = new char[26];
        int j = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            arr[j++] = i;
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
