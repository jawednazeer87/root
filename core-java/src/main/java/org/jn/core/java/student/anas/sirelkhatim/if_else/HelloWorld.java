package org.jn.core.java.student.anas.sirelkhatim.if_else;

public class HelloWorld {

    public static void main(String[] args) {
        
        int n = 45;
        
        if((n % 5 == 0) && (n % 3 == 0))
            System.out.println("hello world");
        else if(n % 3 == 0) 
            System.out.println("hello");
        else
            System.out.println("world");
            
    }

}
