package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment343 {
    /*
	343
	51. wap to print 'low' if any given character is lower case
*/

    static void printLow(char letter) {
        if (letter >= 'a' && letter <= 'z') {
            System.out.println("low");
        } else {
            System.out.println(letter);
        }
    }

    public static void main(String[] args) {
        printLow('a');
        printLow('A');
    }
}
