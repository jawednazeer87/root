package org.jn.core.java.student.Anas.Sirelkhatim.Ternary;

import java.util.Scanner;

public class GreatestTwoNumbersTernary {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        
        int i = input.nextInt();
        int j = input .nextInt();
        String result;
       
        
       result = (i > j) ? "I is the greatest" : "J is the greatest";
       
       System.out.println(result);
        
        input.close();
    }

}