package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment23 {
    /*
  23)wap to count occurrences of each element in an array?
    */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 8, 5, 10, 1, 1};

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j])
                    count++;
            }
            System.out.println(arr[i]+" appear " + count+" times");
        }
    }
}