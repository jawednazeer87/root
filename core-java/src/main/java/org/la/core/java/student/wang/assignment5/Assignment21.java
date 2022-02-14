package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Assignment21 {
    /*
  21) wap to print all prime numbers from an array ?
    */
    static Logger log = LoggerFactory.getLogger(Assignment21.class);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6, 7, 8, 9, 10,11,12};

        for (int i = 0; i < arr.length; i++) { //arr[i=4]=2
            boolean isPrime = true;

            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                   isPrime=false;
                   break;
                }
            }
            if (isPrime) {
                log.info(arr[i] + " are the prime numbers in the array");
            }
        }
    }
}