
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment74 {
    /*
74	48. wap to find least number among three numbers
    */
    static Logger log = LoggerFactory.getLogger(Assignment74.class);

    public static void main(String[] args) {
        int a = 18, b = 11, c = 1;
        if (a < b) {
            if (a < c) {
                log.info(a + " is least number");
            } else {
                log.info(c + " is least number");
            }
        } else {
            if (b < c) {
                log.info(b + " is least number");
            } else {
                log.info(c + " is least number");
            }

        }

    }
}