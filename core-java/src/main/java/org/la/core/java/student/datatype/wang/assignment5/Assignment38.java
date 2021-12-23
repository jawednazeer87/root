package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment38 {
    /*
 38) Find largest and smallest elements of an array? 
    */
    static Logger log = LoggerFactory.getLogger(Assignment38.class);
    public static void main(String[] args) {
        int[] arr = {20, 21, 30, 41, 50, 51, 50};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        log.info("max = " + max);
        log.info("min = " + min);
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
