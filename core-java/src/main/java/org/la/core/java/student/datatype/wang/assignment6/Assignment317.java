package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment317 {
    /*
317
	50)	wap to find the largest and smallest number in an integer array
		Suppose given array is [100, 30, -20, 0] -> largest=100, smallest=-20
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
        int[] arr1 = {100, 30, -20, 0};
        largestAndSmallest(arr1);
    }
}
