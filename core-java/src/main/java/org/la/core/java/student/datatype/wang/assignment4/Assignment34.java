package org.la.core.java.student.datatype.wang.assignment4;

public class Assignment34 {
    //34.	wap to print all upper case alphabets except vowels.

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i=='A' || i=='E' || i=='I'|| i=='O'||i=='U')
                continue;
            System.out.println(i);
        }
    }
}
