package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment10 {
    /*
   10) wap to print array in reverse order
    */
    public static void main(String[] args) {
        int[] arr = {2, 3, 11};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}
