package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment331 {
    /*
	331
	40.	wap to find factorial of a given number
*/

    static void factorialOfGivenNumber(int num) {
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);
    }

    public static void main(String[] args) {
        factorialOfGivenNumber(4);
    }
}
