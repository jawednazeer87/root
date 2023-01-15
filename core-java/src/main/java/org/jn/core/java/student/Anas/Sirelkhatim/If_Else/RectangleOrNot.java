package org.jn.core.java.student.anas.sirelkhatim.if_else;

import java.util.Scanner;

public class RectangleOrNot {

    public static void main(String[] args) {
        
  Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int i = input.nextInt();
        
        if (n == i)
                System.out.println("Square");
        else
            System.out.println("Rectangle");
            
        input.close();

    }

}
