package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment308 {
    /*
308
	15) wap to find smallest number among array element
*/
    public static int smallestNumber(int[] arr) {
        int smallest = arr[0];
        for (int element : arr) {
            if (element< smallest) {
                smallest = element;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -5};
        System.out.println("greatestNumber(arr) = " + smallestNumber(arr));
    }
}