
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment75 {
    /*
75	49. wap to check whether a given character is capital 'A' or not
    */
    static Logger log = LoggerFactory.getLogger(Assignment75.class);

    public static void main(String[] args) {
        char a = 'A';
        if (a == 'A') {
            log.info(a + " is capital 'A'");
        } else {
            log.info(a + " is not capital 'A'");
        }

    }
}