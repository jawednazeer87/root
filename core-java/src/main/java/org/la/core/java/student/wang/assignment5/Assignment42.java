package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment42 {
    /*
 42)	wap to convert an array of characters from lower case to upper case, e.g if arr[] = {'A', 'B', 'C'}
		then after conversion final array should be arr[] = {'a', 'b', 'c'}
    */
    static Logger log = LoggerFactory.getLogger(Assignment42.class);
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 32;
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
