package org.jn.core.java.student.anas.sirelkhatim.ternary;

import java.util.Scanner;

public class SmallestTwoNumbersTernary {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i = input.nextInt();
        int j = input .nextInt();
        String result;
       
        
       result = (i < j) ? "I is the smallest" : "J is the smallest";
       System.out.println(result);
        
        input.close();

    }

}