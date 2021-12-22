package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment53 {
    /*
    53)	wap to find whether an array of characters having 'a' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array has 'a'
		Suppose given array is ['A', '5', '7', 'p'] -> this array doesn't have 'a'
    */
    public static void main(String[] args) {
        char[] arr = {'A', '5', '7', 'p'};
        boolean hasLowerCaseA=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=='a'){
                System.out.println("this array has 'a'");
                break;
            }
        }
        if (hasLowerCaseA){
            System.out.println("this array has 'a'");
        }else {
            System.out.println("this array doesn't have 'a'");
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
