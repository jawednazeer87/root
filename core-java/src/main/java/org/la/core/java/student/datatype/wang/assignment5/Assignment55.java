package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment55 {
    /*
    55) wap to print all ascii value of character array
		Suppose given array is ['a', '5', '7', 'p'] -> answer would be : 97, 53, 55, 112
    */
    static Logger log = LoggerFactory.getLogger(Assignment55.class);
    public static void main(String[] args) {
        char[] arr = {'a', '5', '7', 'p'};
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i]=(int)arr[i];
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
        log.info("Arrays.toString(arr) = " + Arrays.toString(result));
    }
}
