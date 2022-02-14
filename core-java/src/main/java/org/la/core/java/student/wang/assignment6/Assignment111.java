package org.la.core.java.student.wang.assignment6;

public class Assignment111 {
/*
111
	int smallest(int[])
		find smallest element of an array and return that smallest value
 */
    public int smallest(int[] arr) {
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[0]>arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Assignment111 assignment111 = new Assignment111();
        int[] arr ={1,11,111};
        System.out.println("assignment111.smallest(arr) = " + assignment111.smallest(arr));
    }
}
