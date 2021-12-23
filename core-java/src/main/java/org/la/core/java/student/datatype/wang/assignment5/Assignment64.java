
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment64 {
    /*
  64	39.	wap to print number from 50 to 45
    */
    static Logger log = LoggerFactory.getLogger(Assignment64.class);

    public static void main(String[] args) {
        for (int i = 50; i >= 45; i--) {
            log.info(i + " ");
        }
    }
}
