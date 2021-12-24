package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment19 {
    /*
   19) wap to find duplicate elements in an array?
    */
    static Logger log = LoggerFactory.getLogger(Assignment19.class);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    log.info(arr[i] +" is a duplcate elements");
            }
        }
    }
}
