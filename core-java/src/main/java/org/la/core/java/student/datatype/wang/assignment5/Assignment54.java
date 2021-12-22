package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment54 {
    /*
    54)	wap to find whether an array of characters having 'Z' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array doesn't have 'Z'
		Suppose given array is ['A', '5', 'Z', 'p'] -> this array has 'Z'
    */
    public static void main(String[] args) {
        char[] arr = {'A', '5', '7', 'p'};
        boolean hasCapitalCaseZ=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]=='Z'){
                System.out.println("this array has 'Z'");
                break;
            }
        }
        if (hasCapitalCaseZ){
            System.out.println("this array has 'Z'");
        }else {
            System.out.println("this array doesn't have 'Z'");
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
