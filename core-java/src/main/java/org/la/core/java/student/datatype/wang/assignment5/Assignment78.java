
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment78 {
    /*
78	52. wap to print 'num' if any given character is char numeric e.g. '1' or any such given number
    */
    static Logger log = LoggerFactory.getLogger(Assignment78.class);

    public static void main(String[] args) {
        char a = '1';
        if (a >= 48 && a <= 57) {
            log.info("num");
        } else {
            log.info(a + " is not num");
        }

    }
}