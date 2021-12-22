
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment78 {
    /*
78	52. wap to print 'num' if any given character is char numeric e.g. '1' or any such given number
    */
    public static void main(String[] args) {
        char a = '1';
        if (a >= 48 && a <= 57) {
            System.out.println("num");
        }else {
            System.out.println(a+" is not num");
        }

    }
}