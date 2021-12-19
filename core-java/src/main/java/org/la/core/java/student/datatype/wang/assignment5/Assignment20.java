package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment20 {
    /*
   20) wap to check whether two array are equal or not(means we have to check each element of two arrays)?
    */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        int[] arr2 = {2, 2, 3, 4, 2, 7, 8, 8, 3};
        boolean isEqual =true;
        if (arr1.length== arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]!=arr2[i]){
                    isEqual=false;
                }
            }
        }else {
            isEqual=false;
        }
        if (isEqual){
            System.out.println("Two arrays are equal");
        }else {
            System.out.println("Two arrays are not equal");
        }

    }
}