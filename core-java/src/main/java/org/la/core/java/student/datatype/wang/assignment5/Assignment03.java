package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment03 {
    /*
    03) wap to find length of an array
    */
    static Logger log = LoggerFactory.getLogger(Assignment03.class);
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int length = arr.length;
        log.info("length = " + length);

    }
}
