
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment89 {
    static Logger log = LoggerFactory.getLogger(Assignment89.class);

    public static void main(String[] args) {

        int first = 10, second = 0;
        if (first < 10)
            second = 1;
        if (first >= 10)
            second = 2;
        log.info("y is " + second);
    }
}