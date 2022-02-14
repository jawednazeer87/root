
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment72 {
    /*
72	46. wap to find greatest number among three numbers
    */
    static Logger log = LoggerFactory.getLogger(Assignment72.class);

    public static void main(String[] args) {
        int a = 18, b = 11, c = 14;
        if (a > b) {
            if (a > c) {
                log.info(a + " is greatest number");
            } else {
                log.info(c + " is greatest number");
            }
        } else {
            if (b > c) {
                log.info(b + " is greatest number");
            } else {
                log.info(c + " is greatest number");
            }
        }
    }
}