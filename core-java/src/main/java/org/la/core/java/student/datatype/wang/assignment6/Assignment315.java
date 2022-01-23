package org.la.core.java.student.datatype.wang.assignment6;

import java.util.Arrays;

public class Assignment315 {
    /*
315
	38)Find largest and smallest elements of an array?
*/
    public static void largestAndSmallest(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];

        for (int element : arr) {
            if (element > largest) {
                largest = element;
            }
            if (element < smallest) {
                smallest = element;
            }
        }
        System.out.println("smallest = " + smallest);
        System.out.println("largest = " + largest);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        largestAndSmallest(arr1);
    }
}