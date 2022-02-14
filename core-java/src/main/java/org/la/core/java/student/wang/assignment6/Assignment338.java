package org.la.core.java.student.wang.assignment6;

public class Assignment338 {
    /*
	338
	46. wap to find greatest number among three numbers
*/

    static void greatestNum(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is greastest number.");
            } else {
                System.out.println(num3 + " is greastest number.");
            }
        } else {
            if (num2 > num3) {
                System.out.println(num2 + " is greastest number.");
            } else {
                System.out.println(num3 + " is greastest number.");
            }
        }
    }

    public static void main(String[] args) {

        greatestNum(111, 1, 22);
    }
}
