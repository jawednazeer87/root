
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment82 {
    static Logger log = LoggerFactory.getLogger(Assignment82.class);

    public static void main(String[] args) {
        boolean a, b, c;
        a = b = c = true;
        if (!a || (b && c)) { //false||(true && true)>>true
            log.info("If executed");
        } else {
            log.info("else executed");
        }
    }
}