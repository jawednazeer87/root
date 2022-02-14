package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment58 {
    /*
  58	34.	wap to print all upper case alphabets except vowels.
    */
    static Logger log = LoggerFactory.getLogger(Assignment58.class);
    public static void main(String[] args) {
        char[] arr = new char[26-5];
        int j = 0;

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
                continue;
            }
            arr[j++] = i;
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
