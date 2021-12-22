
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment77 {
    /*
77	51. wap to print 'low' if any given character is lower case
    */
    public static void main(String[] args) {
        char a = 'b';
        if (a >= 97 && a <= 122) {
            System.out.println("low");
        }else {
            System.out.println(a+" is not lower case");
        }

    }
}