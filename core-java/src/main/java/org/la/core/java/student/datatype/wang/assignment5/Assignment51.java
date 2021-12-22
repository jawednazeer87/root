package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment51 {
    /*
    51) wap to count all prime numbers of an array?
		Suppose given array is [100, 19, 2, 7, 50] -> 19, 2, 7 are prime numbers so the count = 3
    */
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
        System.out.println("countOfPrimeNumbers = " + countOfPrimeNumbers);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }
}
