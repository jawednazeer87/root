package org.la.core.java.student.wang.assignment6;

public class Assignment109 {
/*
109
	int average(int[])
		find the average of array elements and return average
 */
    public int average(int[] arr) {
        int ave,sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        ave = sum/ arr.length;
        return ave;
    }
}
