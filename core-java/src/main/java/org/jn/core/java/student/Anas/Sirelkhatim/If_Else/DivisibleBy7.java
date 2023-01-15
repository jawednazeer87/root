package org.jn.core.java.student.anas.sirelkhatim.if_else;

import java.util.Scanner;

public class DivisibleBy7 {

    public static void main(String[] args) {
       
Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        if (n%7 == 0)
            System.out.println("divisible by 7");
        else
            System.out.println("not divisible by 7");
        input.close();

    }

}
