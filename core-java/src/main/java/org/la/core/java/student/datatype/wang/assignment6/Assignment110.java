package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment110 {
/*
110
	int greatest(int[])
		find the greatest element of an array and return that greatest value
 */
    public int greatest(int[] arr) {
        int greatest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[0]<arr[i]){
                greatest = arr[i];
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        Assignment110 assignment110 = new Assignment110();
        int[] arr ={1,11,111};
        System.out.println("assignment110.greatest(arr) = " + assignment110.greatest(arr));
    }
}
