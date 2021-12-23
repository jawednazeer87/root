package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment34 {
    /*
 34) wap to remove all zero element from an array?
    */
    static Logger log = LoggerFactory.getLogger(Assignment34.class);
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 0, 4, 5, 3, 6, 0, 2, 0};
        int length =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                length++;
            }
        }
        int[] newArr = new int[length];
        for (int i = 0, j=0; i < arr.length; i++) {
            if (arr[i]!=0){
                newArr[j++]=arr[i];
            }
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
        log.info("Arrays.toString(arr) = " + Arrays.toString(newArr));
    }
}