
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment70 {
    /*
70	44. wap to print 100 if number is between 100 to 200
    */
    static Logger log = LoggerFactory.getLogger(Assignment70.class);

    public static void main(String[] args) {
        int num = 188;
        if (num > 100 && num < 200) {
            log.info("100");
        }
    }
}