package org.la.core.java.student.wang.assignment3;

public class Assignment13_CheckIsLowerCaseOrUpperCase {
    //13.	Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
    //		Hint: u can use ascii value to solve this issue
    public static void main(String[] args) {
        char a = 65, b = 90, c = 97, d = 122;
        char e = '!';
        if (e >= 65 && e <= 90 || e >= 97 && e <= 122) {
            System.out.println(e + " is lowercase ( a to z ) or uppercase ( A to Z )");
        } else {
            System.out.println(e + " is not lowercase ( a to z ) or uppercase ( A to Z )");
        }

    }
}
