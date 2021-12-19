package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment14 {
    /*
   14) wap to find greatest number from any array
    */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("max = " + max);
    }
}
