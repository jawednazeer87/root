package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment102 {
/*
102
void printPositive(int[])
		method will print all positive number from supplied array
 */
    public void printPositive(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
}
