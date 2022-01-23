package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment318 {
    /*
318
 	51) wap to count all prime numbers of an array?
		Suppose given array is [100, 19, 2, 7, 50] -> 19, 2, 7 are prime numbers so the count = 3
*/

    public static int countsOfPrimeNumbers(int[] arr) {

        int count=0;
        for (int element : arr) {
            if (isPrime(element)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {100, 19, 2, 7, 50};
        int countsOfPrimeNumbers = countsOfPrimeNumbers(arr1);
        System.out.println("countsOfPrimeNumbers = " + countsOfPrimeNumbers);
    }
}
