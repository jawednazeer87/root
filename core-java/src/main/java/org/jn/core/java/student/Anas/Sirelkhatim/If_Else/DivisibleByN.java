package org.jn.core.java.student.anas.sirelkhatim.if_else;

import java.util.Scanner;

public class DivisibleByN {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int div = input.nextInt();
        
        if (n%div == 0)
            System.out.println("Divisible");
        else
            System.out.println("not divisible");
        
        
        
        input.close();

    }

}
