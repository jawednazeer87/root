package org.jn.core.java.student.anas.sirelkhatim.if_else;

public class KidTeenageAdult {

    public static void main(String[] args) {
        
        int age = 15;
        
        if (age < 13)
            System.out.println("kid");
        else if (age >=13 && age < 18) 
            System.out.println("teenage");
        else
            System.out.println("adult");
    }

}
