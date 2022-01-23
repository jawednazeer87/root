package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment313 {
    /*
313
	26) wap to test if an array contains a specific value?
*/
    public static boolean isContain(int[] arr, int num) {
        boolean result = false;
        for (int element : arr) {
            if (element == num){
                result =true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int num =3;
        boolean result = isContain(arr1, num);
        System.out.println("Does array contain the element "+ num +" ? "+result);
    }
}