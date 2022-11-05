package org.jn.core.java.student.Anas.Sirelkhatim.If_Else;

import java.util.Scanner;

public class MultipleOf10 {

    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        if (n%10 == 0)
            System.out.println("Divisible");
        else
            System.out.println("Not Divisible");
            
        
        
        input.close();

    }

}
