package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment54 {
    /*
    54)	wap to find whether an array of characters having 'Z' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array doesn't have 'Z'
		Suppose given array is ['A', '5', 'Z', 'p'] -> this array has 'Z'
    */
    static Logger log = LoggerFactory.getLogger(Assignment54.class);
    public static void main(String[] args) {
        char[] arr = {'A', '5', '7', 'p'};
        boolean hasCapitalCaseZ=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=='Z'){
                log.info("this array has 'Z'");
                break;
            }
        }
        if (hasCapitalCaseZ){
            log.info("this array has 'Z'");
        }else {
            log.info("this array doesn't have 'Z'");
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
