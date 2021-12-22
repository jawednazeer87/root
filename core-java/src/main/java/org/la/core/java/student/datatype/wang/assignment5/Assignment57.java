package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment57 {
    /*
   57	33.	wap to print all upper case alphabets.
    */
    public static void main(String[] args) {
        char[] arr = new char[26];
        int j = 0;

        for (char i = 'A'; i <= 'Z'; i++) {
            arr[j++] = i;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
