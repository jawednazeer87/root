
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment77 {
    /*
77	51. wap to print 'low' if any given character is lower case
    */
    static Logger log = LoggerFactory.getLogger(Assignment77.class);

    public static void main(String[] args) {
        char a = 'b';
        if (a >= 97 && a <= 122) {
            log.info("low");
        } else {
            log.info(a + " is not lower case");
        }

    }
}