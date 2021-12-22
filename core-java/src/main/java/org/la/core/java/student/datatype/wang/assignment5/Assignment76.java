
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment76 {
    /*
76	50. wap to print 'up' if any given character is upper case
    */
    public static void main(String[] args) {
        char a = 'A';
        if (a >= 65 && a <= 90) {
            System.out.println("up");
        }else {
            System.out.println(a+" is not upper case");
        }

    }
}