
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment86 {
    static Logger log = LoggerFactory.getLogger(Assignment86.class);

    public static void main(String[] args) {
        int a = 7 * 3 + 6 / 2 - 5; //a = 19

        int b = 21 - 8 + a % 3 * 11; //b = 24

        log.info("a = " + a);
        log.info("b = " + b);

        if (a < b) {
            log.info("A is less than B");
        }
        if (a == b) {
            log.info("A is equal to B");
        }
        if (a > b) {
            log.info("A is greater than B");
        }
    }
}