package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment344 {
    /*
	344
	52. wap to print 'num' if any given character is char numeric e.g. '1' or any such given number
*/

    static void printNum(char letter) {
        if (letter >= '0' && letter <= '9') {
            System.out.println("num");
        } else {
            System.out.println(letter);
        }
    }

    public static void main(String[] args) {
        printNum('a');
        printNum('1');
    }
}
