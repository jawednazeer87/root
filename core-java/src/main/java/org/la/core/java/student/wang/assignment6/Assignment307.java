package org.la.core.java.student.wang.assignment6;

public class Assignment307 {
    /*
307
	14) wap to find greatest number from any array
*/
    public static int greatestNumber(int[] arr) {
        int greatest = arr[0];
        for (int element : arr) {
            if (element> greatest) {
               greatest = element;
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, -5};
        System.out.println("greatestNumber(arr) = " + greatestNumber(arr));
    }
}