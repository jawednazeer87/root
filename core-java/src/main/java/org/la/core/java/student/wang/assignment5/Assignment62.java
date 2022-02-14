
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment62 {
    /*
  62	37.	wap to print all numbers from 1 to 10 except 3 and 7.
    */
    static Logger log = LoggerFactory.getLogger(Assignment62.class);
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i==3||i==7){
                continue;
            }
            log.info(i+" ");
        }

    }
}
