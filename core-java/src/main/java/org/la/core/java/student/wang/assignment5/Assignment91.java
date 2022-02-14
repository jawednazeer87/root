
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment91 {
    static Logger log = LoggerFactory.getLogger(Assignment91.class);

    public static void main(String[] args) {

        int x = 20;
        int y = 25;
        if (++x < (y = y -= 4) || (x = x += 4) > y) {
            log.info(x + " " + y);
        }
    }
}