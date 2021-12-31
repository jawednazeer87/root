
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment79 {
    /*
79	53. wap to check whether a given number is positive and double digit or single digit number
    */
    static Logger log = LoggerFactory.getLogger(Assignment79.class);

    public static void main(String[] args) {
        int a = -9;
        if (a > 0) {
            if (a < 10) {
                log.info(a + " is positive and single digit number");
            } else if (a < 100 && a > 9) {
                log.info(a + " is positive and two digit number");
            }
        } else {
            if (a > -10) {
                log.info(a + " is negative and single digit number");
            } else if (a > -100 && a < -9) {
                log.info(a + " is negative and two digit number");
            }
        }
    }
}