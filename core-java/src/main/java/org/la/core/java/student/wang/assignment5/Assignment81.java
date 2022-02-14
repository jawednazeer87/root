
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment81 {
    /*
81	55. wap to print 'capital' if given character is capital letter, else print 'small' if charater is in lower case
    */
    static Logger log = LoggerFactory.getLogger(Assignment81.class);

    public static void main(String[] args) {
        char ch = 'b';
        if (ch >= 'a' && ch <= 'z') {
            log.info("small");
        } else if (ch >= 'A' && ch <= 'Z') {
            log.info("capital");
        }
    }
}