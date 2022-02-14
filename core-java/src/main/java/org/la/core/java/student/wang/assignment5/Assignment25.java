package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment25 {
    /*
  25)wap to calculate the average value of array elements?
    */
    static Logger log = LoggerFactory.getLogger(Assignment25.class);
    public static void main(String[] args) {
        int[] arr = {4, 2, 3};
        int length = arr.length, sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int aveValue = sum / length;
        log.info("aveValue = " + aveValue);
    }
}