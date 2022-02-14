
package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment93 {
    static Logger log = LoggerFactory.getLogger(Assignment93.class);
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        if(a==1 || ++b==3){
            log.info("hello world");
        }
        log.info("a = " + a);
        log.info("b = " + b);
    }
}