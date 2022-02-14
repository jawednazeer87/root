package org.la.core.java.student.wang.assignment6;

public class Assignment304 {
    /*
304
	07) wap to print only negative number from an array
*/
    public static void negativeNumber(int[] arr) {
        for (int i : arr) {
            if (i <0){
                System.out.print(i+" ");;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,-3,4,-5};
        negativeNumber(arr);
    }
}