package org.la.core.java.student.datatype.wang.assignment6;

public class Assignment342 {
    /*
	342
	50. wap to print 'up' if any given character is upper case
*/

    static void printUp(char letter) {
        if  (letter>='A'&& letter <='Z'){
            System.out.println("up");
        }else {
            System.out.println(letter);
        }
    }

    public static void main(String[] args) {
        printUp('a');
        printUp('A');
    }
}
