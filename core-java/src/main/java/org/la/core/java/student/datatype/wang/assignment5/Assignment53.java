package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment53 {
    /*
    53)	wap to find whether an array of characters having 'a' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array has 'a'
		Suppose given array is ['A', '5', '7', 'p'] -> this array doesn't have 'a'
    */
    static Logger log = LoggerFactory.getLogger(Assignment53.class);

    public static void main(String[] args) {
        char[] arr = {'A', '5', '7', 'p'};
        boolean hasLowerCaseA = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                log.info("this array has 'a'");
                break;
            }
        }
        if (hasLowerCaseA) {
            log.info("this array has 'a'");
        } else {
            log.info("this array doesn't have 'a'");
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
