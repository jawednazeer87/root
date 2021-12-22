package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment26 {
    /*
  26) wap to test if an array contains a specific value?
    */
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1, 7};
        int element = 7;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("the array contains the element " + element);
            }
        }
    }
}