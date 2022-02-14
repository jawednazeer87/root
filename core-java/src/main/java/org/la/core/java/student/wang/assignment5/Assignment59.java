package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment59 {
    /*
  59	34.	wap to print all lower case alphabets except vowels.
    */
    static Logger log = LoggerFactory.getLogger(Assignment59.class);
    public static void main(String[] args) {
        char[] arr = new char[26-5];
        int j = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            if (i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                continue;
            }
            arr[j++] = i;
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
