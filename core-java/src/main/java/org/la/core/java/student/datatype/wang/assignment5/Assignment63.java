package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment63 {
    /*
  63	38.	wap to print all numbers from 1 to 10 except 2 and 5 and 8.
    */
    static Logger log = LoggerFactory.getLogger(Assignment63.class);

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 2 || i == 5 || i == 8) {
                continue;
            }
            log.info(i + " ");
        }

    }
}
