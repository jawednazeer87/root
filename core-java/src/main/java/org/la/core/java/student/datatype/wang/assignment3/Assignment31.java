package org.la.core.java.student.datatype.wang.assignment3;

public class Assignment31 {
    public static void main(String[] args) {
        int marks = 50;
        if( marks >= 70 )
            System.out.println("Distinction");

        if( marks < 70 && marks >= 35 )
            System.out.println("Pass");

        if( marks < 35 )
            System.out.println("Fail");
    }
}
