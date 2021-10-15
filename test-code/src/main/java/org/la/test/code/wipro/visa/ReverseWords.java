package org.la.test.code.wipro.visa;

import java.util.Arrays;
import java.util.List;

/*
    Program to reverse word based on space
    IP -   Hello world how are you
    OP -   you are how world Hello
 */
public class ReverseWords {

    public static void reverse(char[] arr, int start, int end){
        while(start<end){
            char t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        String src = "Hello world how are you";
        char[] arr = src.toCharArray();
        reverse(arr, 0, arr.length-1);
        reverseEachWord(arr);
        String trg = String.valueOf(arr);
        System.out.println("Original String:             "+src);
        System.out.println("Reverse Each Word of String: "+trg);
    }

    static void reverseEachWord(char[] arr){
        int start = 0;
        int end = -1;
        int i = 0;
        int len = arr.length;
        for(; i<len ; i++){
            if(arr[i]==' '){
                end = i - 1;
                reverse(arr, start, end);
                start = i+1;
            }
        }
        reverse(arr, start, len-1);
    }
}
