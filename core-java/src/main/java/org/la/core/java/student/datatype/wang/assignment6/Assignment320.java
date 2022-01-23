package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment320 {
    /*
320
	53)	wap to find whether an array of characters having 'a' or not?
		Suppose given array is ['a', '5', '7', 'p'] -> this array has 'a'
		Suppose given array is ['A', '5', '7', 'p'] -> this array doesn't have 'a'
*/

    public static boolean hasLetterA(char[] arr) {
        boolean result =false;
        for (char element : arr) {
            if (element =='a'){
                result=true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[] arr1 = {'a', '5', '7', 'p'};
        System.out.println("hasLetterA(arr1) = " + hasLetterA(arr1));
    }
}
