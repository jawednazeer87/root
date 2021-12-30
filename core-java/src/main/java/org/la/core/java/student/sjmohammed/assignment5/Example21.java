package org.la.core.java.student.sjmohammed.assignment5;
/*
 * wap to print all prime numbers from an array ?
 */
public class Example21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5,6, 7, 8, 9, 10,11,12};


        for (int i = 0; i < a.length; i++) { 
            boolean isPrime = true;

            for (int j = 2; j < a[i]; j++) {
                if (a[i] % j == 0) {
                   isPrime=false;
                   break;
                }
            }
            if (isPrime) {
                System.out.println(a[i] + " are the prime numbers in the array");
            }
        }
	}

}
