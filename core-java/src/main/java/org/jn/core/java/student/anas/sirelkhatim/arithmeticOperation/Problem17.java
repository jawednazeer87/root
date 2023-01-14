package org.jn.core.java.student.anas.sirelkhatim.arithmeticOperation;


public class Problem17 {

    public static void main(String[] args) {
        
        int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
        
        System.out.println(b);
    }

}
