package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment30 {
    /*
 30) wap to find the common elements between two arrays?
    */
    static Logger log = LoggerFactory.getLogger(Assignment30.class);
    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        log.info("Array1 : " + Arrays.toString(array1));
        log.info("Array2 : " + Arrays.toString(array2));


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == (array2[j])) {

                    log.info("Common element is : " + (array1[i]));
                }
            }
        }
    }
}