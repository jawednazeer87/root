
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment84 {
    static Logger log = LoggerFactory.getLogger(Assignment84.class);

    public static void main(String[] args) {
        if (1 < 2) {
            log.info("1 is less than 2");
            log.info("Hello From IfExample");
        } else
            log.info("2 is less than 1");

    }
}