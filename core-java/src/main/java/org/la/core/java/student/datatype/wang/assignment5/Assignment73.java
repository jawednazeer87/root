
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment73 {
    /*
73	47. wap to find least number among two numbers
    */
    static Logger log = LoggerFactory.getLogger(Assignment73.class);

    public static void main(String[] args) {
        int a = 18, b = 11;
        if (a < b) {
            log.info(a + " is least number");
        } else {
            log.info(b + " is least number");
        }
    }
}