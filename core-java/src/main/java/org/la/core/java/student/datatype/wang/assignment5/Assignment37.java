package org.la.core.java.student.datatype.wang.assignment5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class Assignment37 {
    /*
 37) wap to separate even and odd numbers of a given array of integers. Put all even numbers first, and
		then odd numbers ?
    */
    static Logger log = LoggerFactory.getLogger(Assignment37.class);
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

        log.info("Arrays.toString(arr) = " + Arrays.toString(arr));
        log.info("Arrays.toString(arr) = " + Arrays.toString(result));
    }


//        System.out.println("the new length of the array is "+ sum);
//


}
