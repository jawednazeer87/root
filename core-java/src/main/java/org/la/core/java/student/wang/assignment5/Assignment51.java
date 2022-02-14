package org.la.core.java.student.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment51 {
    /*
    51) wap to count all prime numbers of an array?
		Suppose given array is [100, 19, 2, 7, 50] -> 19, 2, 7 are prime numbers so the count = 3
    */
    static Logger log = LoggerFactory.getLogger(Assignment51.class);
    public static void main(String[] args) {
        int[] arr = {100, 19, 2, 7, 50};
        int countOfPrimeNumbers = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1 || arr[i]==2){
                countOfPrimeNumbers++;
            }
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    countOfPrimeNumbers++;
                    break;
                }
            }
        }
        log.info("countOfPrimeNumbers = " + countOfPrimeNumbers);
        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
