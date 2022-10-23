package org.jn.core.java.student.Anas.Sirelkhatim.datatype;

public class chartoString {

    public static void main(String[] args) {
        
        char ch = 'a';
        char ch2 = 'a';
        
        String str = Character.toString(ch);
        System.out.println("String is: " + str);
        
        String str2 = String.valueOf(ch2);
        System.out.println("String is: " + str2);

    }

}
