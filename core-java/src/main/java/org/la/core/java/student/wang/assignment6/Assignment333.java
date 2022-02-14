package org.la.core.java.student.wang.assignment6;

public class Assignment333 {
    /*
	333
	41. wap to print double if number is a double digit
*/

    static void doubleDigits(int num) {
        if ((num > 9 && num < 100) || (num < -9 && num > -100)) {
            System.out.println("double");
        } else {
            System.out.println(num);
        }
    }
        public static void main (String[]args){
            doubleDigits(4);
            doubleDigits(19);
        }
    }
