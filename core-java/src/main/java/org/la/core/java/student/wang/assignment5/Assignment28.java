package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment28 {
    /*
 28) wap to remove a specific element from an array?
    */
    static Logger log = LoggerFactory.getLogger(Assignment28.class);
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 7};
        int[] resultArr = new int[arr.length-1];
        int element = 3;
        for (int i = 0, j =0; i < arr.length; i++) {
            if (arr[i]!=element){
                resultArr[j++]=arr[i];
            }
        }
        log.info("Arrays.toString(resultArr) = " + Arrays.toString(resultArr));
    }
}