package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment55 {
    /*
    55) wap to print all ascii value of character array
		Suppose given array is ['a', '5', '7', 'p'] -> answer would be : 97, 53, 55, 112
    */
    public static void main(String[] args) {
        char[] arr = {'a', '5', '7', 'p'};
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i]=(int)arr[i];
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(result));
    }
}
