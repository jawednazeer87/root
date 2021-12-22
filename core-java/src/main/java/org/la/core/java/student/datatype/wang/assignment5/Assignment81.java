
package org.la.core.java.student.datatype.wang.assignment5;

public class Assignment81 {
    /*
81	55. wap to print 'capital' if given character is capital letter, else print 'small' if charater is in lower case
    */
    public static void main(String[] args) {
        char ch = 'b';
        if (ch>='a'&& ch<='z'){
            System.out.println("small");
        }else if (ch>='A'&& ch<='Z'){
            System.out.println("capital");
        }
    }
}