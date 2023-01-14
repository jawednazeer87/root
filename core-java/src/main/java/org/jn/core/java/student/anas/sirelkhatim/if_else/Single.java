package org.jn.core.java.student.anas.sirelkhatim.if_else;

import java.util.Scanner;

public class Single {

    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        if(n >= 0 && n <= 9)
            System.out.println("single Digit");
        else
            System.out.println("not single Digit");
        
        input.close();

    }

}
