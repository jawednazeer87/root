package org.la.core.java.student.datatype.wang.assignment3;

public class Assignment57 {
    //      57. wap to print alphabet if the given character is 'alphabet' else print 'non alphabet'
    public static void main(String[] args) {
        char a = '!';
        if (a >= 65 && a <= 90 || a >= 97 && a <= 122) {
            System.out.println("alphabet");
        } else {
            System.out.println("non alphabet");
        }
    }
}