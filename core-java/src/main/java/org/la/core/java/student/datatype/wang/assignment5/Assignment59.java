package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment59 {
    /*
  59	34.	wap to print all lower case alphabets except vowels.
    */
    public static void main(String[] args) {
        char[] arr = new char[26-5];
        int j = 0;

        for (char i = 'a'; i <= 'z'; i++) {
            if (i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                continue;
            }
            arr[j++] = i;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
