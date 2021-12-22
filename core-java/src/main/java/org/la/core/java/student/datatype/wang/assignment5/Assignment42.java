package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment42 {
    /*
 42)	wap to convert an array of characters from lower case to upper case, e.g if arr[] = {'A', 'B', 'C'}
		then after conversion final array should be arr[] = {'a', 'b', 'c'}
    */
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'};
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 32;
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

}
