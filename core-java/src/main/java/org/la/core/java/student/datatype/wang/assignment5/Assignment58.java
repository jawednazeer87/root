package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment58 {
    /*
  58	34.	wap to print all upper case alphabets except vowels.
    */
    public static void main(String[] args) {
        char[] arr = new char[26-5];
        int j = 0;

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
                continue;
            }
            arr[j++] = i;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
