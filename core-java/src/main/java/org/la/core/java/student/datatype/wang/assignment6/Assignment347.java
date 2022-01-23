package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment347 {
    /*
	347
	55. wap to print 'capital' if given character is capital letter, else print 'small' if charater is in lower case
*/

    static void capitalOrSmall(char letter) {
        if (letter >= 'a' && letter <= 'z') {
            System.out.println("small");
        } else if (letter >= 'A' && letter <= 'Z') {
            System.out.println("capital");
        }

    }

    public static void main(String[] args) {
        capitalOrSmall('a');
        capitalOrSmall('A');
    }
}
