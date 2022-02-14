
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment68 {
    /*
68	42. wap to print single if number is single digit
    */
    static Logger log = LoggerFactory.getLogger(Assignment69.class);

    public static void main(String[] args) {
        int num = 1, temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count == 1) {
            log.info(num + " is sigle digit.");
        }
    }
}