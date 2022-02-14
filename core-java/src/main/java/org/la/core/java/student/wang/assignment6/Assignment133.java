package org.la.core.java.student.wang.assignment6;

import java.util.Arrays;

public class Assignment133 {
    /*
	133
	char[] reverse(char[] src)
		create new array and copy the src array to new array in reverse order
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