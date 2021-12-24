
package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment80 {
    /*
80	54. wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
    */
    static Logger log = LoggerFactory.getLogger(Assignment80.class);

    public static void main(String[] args) {
        int age = 9;
        if (age<13){
            log.info("kid");
        }else if (age<18){
            log.info("teenager");
        }else {
            log.info("adult");
        }
    }
}