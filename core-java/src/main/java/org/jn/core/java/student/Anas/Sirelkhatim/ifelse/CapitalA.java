package org.jn.core.java.student.anas.sirelkhatim.ifelse;
import java.util.Scanner;

public class CapitalA {

    public static void main(String[] args) {
       
Scanner input = new Scanner(System.in);
        
        char n = input.next().charAt(0);
        
        if (n == 65)
            System.out.println("Letter is capital A");
        else
            System.out.println("Letter is not capital A");
                
        input.close();

    }

}
