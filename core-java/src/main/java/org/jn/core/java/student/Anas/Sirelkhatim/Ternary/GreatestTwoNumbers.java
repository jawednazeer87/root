package org.jn.core.java.student.Anas.Sirelkhatim.Ternary;

import java.util.Scanner;

public class GreatestTwoNumbers {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        int i = input.nextInt();
        int j = input .nextInt();
        
        if(i > j)
            System.out.println("i is the greatest");
        else
            System.out.println("j is the greatest");
    
        input.close();

    }

}
