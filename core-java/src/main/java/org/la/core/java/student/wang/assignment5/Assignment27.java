package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment27 {
    /*
 27) wap to find the index of an array element(here u have to take any number and check that number is
		present inside an array or not,
	    if 	not print -1, if present then print its index means of that element)?
    */
    static Logger log = LoggerFactory.getLogger(Assignment27.class);
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 7};
        int element = 0;
        boolean isContains =false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                isContains= true;
                log.info("the array contains the element " + element+" , and the index is "+i);
                break;
            }
        }
        if (isContains==false){
            log.info("-1");
        }
    }
}