
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment67 {
    /*
 67	41. wap to print double if number is a double digit
    */
    static Logger log = LoggerFactory.getLogger(Assignment67.class);

    public static void main(String[] args) {
        int num = 188, temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count == 2) {
            log.info(num + " is double digit.");
        }
    }
}