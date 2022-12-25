package org.jn.core.java.student.Anas.Sirelkhatim.If_Else;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
       
Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        if(n > 99  && n <= 999)
            System.out.println("ternary Digit");
        else
            System.out.println("not ternary Digit");
        input.close();

    }

}
