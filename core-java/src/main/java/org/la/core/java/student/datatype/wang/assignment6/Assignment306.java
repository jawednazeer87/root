package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment306 {
    /*
306
	09) wap to print number not divisible by given number from an array
*/
    public static void notDivisibleNumber(int[] arr, int num) {
        for (int i : arr) {
            if (i % num != 0) {
                System.out.println(i + " cannot be divisible by number " + num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -5};
        notDivisibleNumber(arr, 2);
    }
}