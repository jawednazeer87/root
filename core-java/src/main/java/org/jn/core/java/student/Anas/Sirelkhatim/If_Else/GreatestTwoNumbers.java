package org.jn.core.java.student.anas.sirelkhatim.if_else;

import java.util.Scanner;

public class GreatestTwoNumbers {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        int i = input.nextInt();
        int j = input.nextInt();
        
        
        if( i > j )
            System.out.println(i);
        
        if(j > i)
            System.out.println(j);
            
        
        input.close();

    }

}