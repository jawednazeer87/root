package org.la.core.java.student.wang.assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment132 {
    /*
  132
	int[] countOneZero(int a[]) - a[] = {1,0,1,0,0,1,1};
		create an array having the count of zero and one in given array,
		return zero and one count array.
		e.g the return array having r[] = {3, 4}
		a[] = {1,0,1,0,0,1,1}; - this array having 3 zeros and 4 ones
     */
    public static int[] countOneZero(int a[]) {
        int[] result = new int[2];
        int frequencyOfZeros = 0, frequencyOfOnes = 0;
        for (int i : a) {
            if (i == 0) {
                frequencyOfZeros++;
            }
            if (i == 1) {
                frequencyOfOnes++;
            }
        }
        result[0] = frequencyOfZeros;
        result[1] = frequencyOfOnes;
        return result;
    }

    public static void main(String[] args) {
        int a[] = {1, 0, 1, 0, 0, 1, 1};
        int[] result = countOneZero(a);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
}