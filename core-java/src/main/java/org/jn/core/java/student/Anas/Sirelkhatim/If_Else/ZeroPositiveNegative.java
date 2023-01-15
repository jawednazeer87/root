package org.jn.core.java.student.anas.sirelkhatim.if_else;

import java.util.Scanner;

public class ZeroPositiveNegative {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        if (n == 0)
            System.out.println("zero");
        else if (n > 0)
            System.out.println("positive");
        else
            System.out.println("negative");
        
       
        input.close();

    }

}
