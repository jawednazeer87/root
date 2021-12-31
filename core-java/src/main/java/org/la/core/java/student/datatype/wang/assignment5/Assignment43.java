package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment43 {
    /*
 43)	wap to multiply 3 to each element of an array
		Suppose given array is [10, 19, 2, 7] -> answer 30, 57, 6, 21
    */
    static Logger log = LoggerFactory.getLogger(Assignment43.class);
    public static void main(String[] args) {
        int[] arr = {10, 19, 2, 7};
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 3;
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
