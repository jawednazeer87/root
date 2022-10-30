package org.jn.core.java.student.Anas.Sirelkhatim.Arithmetic_Operation;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1;
        num1 = input.nextInt();
        
        int num2;
        num2 = input.nextInt();
        
        int rem;
        rem = num1 % num2;
        
        System.out.println("Remainder is "+ rem);
        
        input.close();

    }

}
