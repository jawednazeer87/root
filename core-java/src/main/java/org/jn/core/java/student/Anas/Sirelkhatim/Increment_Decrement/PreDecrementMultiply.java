package org.jn.core.java.student.Anas.Sirelkhatim.Increment_Decrement;

import java.util.Scanner;

public class PreDecrementMultiply {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int j = input.nextInt();
        
        int mul = --n * j;
        
        System.out.println(mul);
        
        
        
        
        
        input.close();

    }

}