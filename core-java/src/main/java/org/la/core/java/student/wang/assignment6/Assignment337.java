package org.la.core.java.student.wang.assignment6;

public class Assignment337 {
    /*
	337
	45. wap to find greatest number among two numbers
*/

    static void greatestNum(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greastest number.");
        } else {
            System.out.println(num2 + " is greastest number.");
        }
    }

    public static void main(String[] args) {

        greatestNum(111, 1);
    }
}
