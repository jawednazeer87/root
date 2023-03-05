package org.jn.core.java.student.Anas.Sirelkhatim.incrementDecrement;

import java.util.Scanner;

public class PostDecrementMultiply {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int j = input.nextInt();
        
        int mul = n-- * j;
        
        System.out.println(mul);
        
        
        
        
        
        input.close();

    }

}
