package org.jn.core.java.student.anas.sirelkhatim.if_else;

public class AlphabetOrNot {

    public static void main(String[] args) {
        
        char n = 'A';
        
        if ((n >= 65 && n <= 90) || (n >= 97 && n <= 122) )
            System.out.println("alphabet");
        else
            System.out.println("not alphabet");

    }

}
