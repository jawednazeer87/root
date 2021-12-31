
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment65 {
    /*
 65	40.	wap to find factorial of a given number
    */
    static Logger log = LoggerFactory.getLogger(Assignment65.class);

    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        log.info("factorial = " + factorial);
    }
}
