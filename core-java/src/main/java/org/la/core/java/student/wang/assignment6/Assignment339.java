package org.la.core.java.student.wang.assignment6;

public class Assignment339 {
    /*
	339
	47. wap to find least number among two numbers
*/

    static void smallestNum(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num1);
        } else if (num2 < num1) {
            System.out.println(num2);
        }

    }

    public static void main(String[] args) {

        smallestNum(111, 1);
    }
}
