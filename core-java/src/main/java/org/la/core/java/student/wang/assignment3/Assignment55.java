package org.la.core.java.student.wang.assignment3;

public class Assignment55 {
    //      55. wap to print 'capital' if given character is capital letter, else print 'small' if charater is in lower case
    public static void main(String[] args) {
        char a = 'a';
        if (a >= 65 && a <= 90) {
            System.out.println("capital");
        } else if (a >= 97 && a <= 122) {
            System.out.println("small");
        }
    }
}