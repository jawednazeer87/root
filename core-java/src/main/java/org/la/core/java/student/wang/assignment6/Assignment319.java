package org.la.core.java.student.wang.assignment6;

public class Assignment319 {
    /*
319
	52)	wap to add all elements of an array and check wether the sum is a prime number or not?
		Suppose given array is [10, 19, 2, 7] -> sum=38 is not a prime number
*/

    public static boolean isSumPrime(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("sum = " + sum);
        return isPrime(sum);
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
        int[] arr1 = {10, 19, 2, 7};
        int[] arr2 ={10, 8, 2, 9};
        System.out.println("isSumPrime(arr1) = " + isSumPrime(arr1));
        System.out.println("isSumPrime(arr2) = " + isSumPrime(arr2));
    }
}
