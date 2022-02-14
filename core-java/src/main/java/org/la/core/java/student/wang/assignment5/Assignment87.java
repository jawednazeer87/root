
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment87 {
    static Logger log = LoggerFactory.getLogger(Assignment87.class);

    public static void main(String[] args) {

        int a = 12 + 21 * 3 - 9 / 2; //71
        int b = 14 - 32 * 4 + 175 / 8 - 3;//-96

        log.info("a = " + a);
        log.info("b = " + b);

        if (++a > 71 && --b < 20) {
            log.info("a = " + a + " b = " + b);
        }
        if (b-- == -97 || a-- < 100) {
            log.info("a = " + a + " b = " + b);
        }
    }
}