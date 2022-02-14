package org.la.core.java.student.wang.assignment6;

public class Assignment303 {
    /*
303
	03) wap to find length of an array
*/
    public static int length(int[] arr) {
        int length =0;
        for (int i : arr) {
            length++;
        }
       return length;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int length = length(arr);
        System.out.println("length = " + length);
    }
}