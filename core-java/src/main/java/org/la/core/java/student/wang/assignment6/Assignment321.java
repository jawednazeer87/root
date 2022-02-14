package org.la.core.java.student.wang.assignment6;

public class Assignment321 {
    /*
321
	54)	wap to find whether an array of characters having 'Z' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array doesn't have 'Z'
		Suppose given array is ['A', '5', 'Z', 'p'] -> this array has 'Z'
*/

    public static boolean hasLetterZ(char[] arr) {
        boolean result =false;
        for (char element : arr) {
            if (element =='Z'){
                result=true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] arr1 = {'A', '5', 'Z', 'p'};
        System.out.println("hasLetterA(arr1) = " + hasLetterZ(arr1));
    }
}
