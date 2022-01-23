package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment340 {
    /*
	340
	48. wap to find least number among three numbers
*/

    static void smallestNum(int num1, int num2, int num3) {
        if (num1 < num2) {
            if (num1 < num3)
                System.out.println("The smallest number is: " + num1);
            else
                System.out.println("The smallest number is: " + num3);
        } else {
            if (num2 < num3)
                System.out.println("The smallest number is: " + num2);
            else
                System.out.println("The smallest number is: " + num3);
        }

    }

    public static void main(String[] args) {

        smallestNum(111, 1, 22);
    }
}
