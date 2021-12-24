
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment76 {
    /*
76	50. wap to print 'up' if any given character is upper case
    */
    static Logger log = LoggerFactory.getLogger(Assignment76.class);

    public static void main(String[] args) {
        char a = 'A';
        if (a >= 65 && a <= 90) {
            log.info("up");
        } else {
            log.info(a + " is not upper case");
        }

    }
}