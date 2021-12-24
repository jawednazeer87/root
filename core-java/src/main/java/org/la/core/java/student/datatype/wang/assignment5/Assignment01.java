package org.la.core.java.student.datatype.wang.assignment5;

import org.apache.logging.log4j.LogManager;
import org.la.core.java.jawed.array.Copy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment01 {
    //01) wap to create and print array using without loop
    static Logger log = LoggerFactory.getLogger(Assignment01.class);
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        log.info("arr[0] = " + arr[0]);
        log.info("arr[1] = " + arr[1]);
        log.info("arr[2] = " + arr[2]);

    }
}
