
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment69 {
    /*
69	43. wap to print ternary if number is 3 digit
    */
    static Logger log = LoggerFactory.getLogger(Assignment69.class);

    public static void main(String[] args) {
        int num = 100, temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count == 3) {
            log.info("ternary");
        }
    }
}