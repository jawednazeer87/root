package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment52 {
    /*
    52)	wap to add all elements of an array and check wether the sum is a prime number or not?
		Suppose given array is [10, 19, 2, 7] -> sum=38 is not a prime number
		Suppose given array is [10, 8, 2, 9] -> sum=29 is a prime number
    */
    static Logger log = LoggerFactory.getLogger(Assignment52.class);
    public static void main(String[] args) {
        int[] arr = {10, 8, 2, 9};
        int sum = 0;
        boolean isPrime = true;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int j = 2; j < sum; j++) {
            if (sum % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            log.info(sum + " is prime number");
        } else {
            log.info(sum + " is not prime number");
        }
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
