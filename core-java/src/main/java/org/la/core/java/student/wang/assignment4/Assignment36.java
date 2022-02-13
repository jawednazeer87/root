package org.la.core.java.student.wang.assignment4;

public class Assignment36 {
    //36.	wap to print all lower case vowels.

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            if (i != 'A' && i != 'E' && i != 'I' && i != 'O' && i != 'U')
                continue;
            System.out.println(i);
        }
    }
}
