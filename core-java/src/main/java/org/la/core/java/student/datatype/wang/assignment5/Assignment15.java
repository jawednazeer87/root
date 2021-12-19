package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment15 {
    /*
   15) wap to find smallest number among array element
    */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("min = " + min);
    }
}
