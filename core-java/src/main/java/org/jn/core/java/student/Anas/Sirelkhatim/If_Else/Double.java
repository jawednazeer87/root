package org.jn.core.java.student.Anas.Sirelkhatim.If_Else;

import java.util.Scanner;

public class Double {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        if(n > 9 && n <= 99)
            System.out.println("Double Digit");
        else
            System.out.println("not double Digit");
        
        input.close();
        
       

    }

}
