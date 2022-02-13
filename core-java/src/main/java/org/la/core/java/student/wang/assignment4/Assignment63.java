package org.la.core.java.student.wang.assignment4;

public class Assignment63 {
    //63.	Wap to print all ASCII character with their values.

    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " = " + (int) i + " ; ");
        }
        System.out.println("");
        for (char j = 'A'; j <= 'Z'; j++) {
            System.out.print(j + " = " + (int) j + " ; ");
        }
    }
}
