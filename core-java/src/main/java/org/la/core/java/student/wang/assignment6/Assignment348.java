package org.la.core.java.student.wang.assignment6;

public class Assignment348 {

    public static void main(String[] args) {
        boolean a, b, c;
        a = b = c = true;
        if( !a || ( b && c ) )//f || t
             {
            System.out.println("If executed");
        }
        else
        {
            System.out.println("else executed");
        }
    }
}
//If executed