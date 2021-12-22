package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment37 {
    /*
 37) wap to separate even and odd numbers of a given array of integers. Put all even numbers first, and
		then odd numbers ?
    */
    public static void main(String[] args) {
        int[] arr = {20, 21, 30, 41, 50, 51, 50};
        int[] result = new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                result[j++]=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                result[j++]=arr[i];
            }
        }

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(result));
    }


//        System.out.println("the new length of the array is "+ sum);
//


}
