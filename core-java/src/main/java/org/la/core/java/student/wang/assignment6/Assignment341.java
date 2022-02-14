package org.la.core.java.student.wang.assignment6;

public class Assignment341 {
    /*
	341
	49. wap to check whether a given character is capital 'A' or not
*/

    static void isCapitalA(char letter) {
        boolean result = false;
        if (letter =='A'){
            result= true;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        isCapitalA('a');
        isCapitalA('A');
    }
}
