package org.la.core.java.student.wang.assignment6;

public class Assignment327 {
    /*
	327
	36.	wap to print all upper case vowels.
*/

    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) {
            if (i=='A'||i=='E'||i=='I'||i=='O'||i=='U'){
                System.out.print(i + " ");
            }
        }
    }
}
