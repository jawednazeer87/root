package org.la.core.java.student.wang.assignment4;

public class Assignment35 {
    //36.	wap to print all lower case vowels.

    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            if (i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u')
                continue;
            System.out.println(i);
        }
    }
}
