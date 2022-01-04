package org.la.core.java.student.datatype.wang.assignment5;

import com.google.protobuf.Enum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment22 {
    /*
  22) wap to calculate the factorial of each element of an array?
    */
    static Logger log = LoggerFactory.getLogger(Assignment22.class);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i], f = 1;
            while (n >= 1) {
                f = f * n;
                n--;
            }
            log.info(arr[i] + "'s factorial is " + f);
        }
    }
}