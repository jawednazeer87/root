
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment66 {
    /*
 66	40. wap to print hi if number is zero and by if number is 100
    */
    static Logger log = LoggerFactory.getLogger(Assignment66.class);

    public static void main(String[] args) {

        for (int i = 0; i <= 110; i++) {
            if (i == 0) {
                log.info("hi ");
            } else if (i == 100) {
                log.info("by ");
            } else {
                log.info(i + " ");
            }
        }
    }
}
