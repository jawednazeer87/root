package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment24 {
    /*
  24)wap to remove duplicate elements from an array?
    */
    static Logger log = LoggerFactory.getLogger(Assignment24.class);
    public static void main(String[] args) {
        Integer[] origArr = {1, 2, 3, 4, 5, 6, 1, 8, 5, 10, 1, 1};
        for (int i = 0; i <= origArr.length - 1; i++) {
            for (int j = i + 1; j <= origArr.length - 1; j++) {
                if (origArr[i] == origArr[j]) {
                    origArr[j] = null;
                }
            }
        }

        log.info("Arrays.toString(origArr) = " + Arrays.toString(origArr));
    }
}