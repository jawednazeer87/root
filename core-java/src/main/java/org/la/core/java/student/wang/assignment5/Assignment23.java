package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment23 {
    /*
  23)wap to count occurrences of each element in an array?
    */
    static Logger log = LoggerFactory.getLogger(Assignment23.class);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 8, 5, 10, 1, 1};

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j])
                    count++;
            }
            log.info(arr[i]+" appear " + count+" times");
        }
    }
}