package org.la.core.java.student.wang.assignment6;

public class Assignment101 {
/*
101
void printNegative(int[])
		method will print all negative number from supplied array
 */
    public void printNegative(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                System.out.println(arr[i]);
            }
        }
    }
}
