package org.la.core.java.student.wang.assignment6;

public class Assignment104 {
/*
104
void printOdd(int[])
		method will print all odd number from supplied array
 */
    public void printOdd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
