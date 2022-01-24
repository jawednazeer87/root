package org.la.core.java.student.datatype.Sahil;

public class d21 {
public static void main(String[] args) {
	int[] a = {1, 2, 3, 4, 5,6, 7, 8, 9, 10,11,12};

    for (int i = 0; i < a.length; i++) { //arr[i=4]=2
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
