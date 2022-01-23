package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment108 {
/*
108
	int sum(int[])
		find sum of all elements of an array and return sum
 */
    public void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
