package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment56 {
    /*
    56	32. wap to print all lower case alphabets.
    */
    public static void main(String[] args) {
        char[] arr = new char[26];
        int j = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            arr[j++] = i;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
