package org.la.core.java.student.datatype.wang.assignment5;

import java.util.Arrays;

public class Assignment24 {
    /*
  24)wap to remove duplicate elements from an array?
    */
    public static void main(String[] args) {
        Integer[] origArr = {1, 2, 3, 4, 5, 6, 1, 8, 5, 10, 1, 1};
        for (int i = 0; i <= origArr.length - 1; i++) {
            for (int j = i + 1; j <= origArr.length - 1; j++) {
                if (origArr[i] == origArr[j]) {
                    origArr[j] = null;
                }
            }
        }

        System.out.println("Arrays.toString(origArr) = " + Arrays.toString(origArr));
    }
}