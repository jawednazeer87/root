package org.la.core.java.student.datatype.wang.assignment6;

import java.util.Arrays;

public class Assignment134 {
    /*
	134
	char[] reverse(char[] src)
		reverse the same array and return.
     */
    public static char[] reverse(char[] src) {
        char[] result = new char[src.length];

        for (int i = src.length-1,j=0; i >= 0; i--,j++) {
            result[j]=src[i];
        }
        return result;
    }

    public static void main(String[] args) {
        char[] arr ={'a','b','c','d'};
        char[] reverse = reverse(arr);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(reverse));
    }
}