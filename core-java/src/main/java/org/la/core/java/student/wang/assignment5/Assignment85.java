
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment85 {
    static Logger log = LoggerFactory.getLogger(Assignment85.class);

    public static void main(String[] args) {
        int marks = 80;
        if (marks > 70)
            log.info("Distinction");
        else if (marks > 35)
            log.info("Pass");
        else {
            log.info("Fail");
            log.info("Better luck next time");
        }
    }
}