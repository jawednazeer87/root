package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment305 {
    /*
305
	08) wap to print number divisible by given number from an array
*/
    public static void divisibleNumber(int[] arr, int num) {
        for (int i : arr) {
            if (i % num == 0) {
                System.out.println(i + " can be divisible by number " + num);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -5};
        divisibleNumber(arr, 2);
    }
}