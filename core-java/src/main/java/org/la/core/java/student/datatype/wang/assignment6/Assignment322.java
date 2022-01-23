package org.la.core.java.student.datatype.wang.assignment6;

import java.util.Arrays;

public class Assignment322 {
    /*
	322
	55) wap to print all ascii value of character array
		Suppose given array is ['a', '5', '7', 'p'] -> answer would be : 97, 53, 55, 112
*/

    public static void convertCharToInt(char[] arr) {
        int[] result = new int[arr.length];
        int i =0;
        for (char element : arr) {
            result[i++]=element;
        }
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

    public static void main(String[] args) {
        char[] arr1 = {'a', '5', '7', 'p'};
        convertCharToInt(arr1);
    }
}
