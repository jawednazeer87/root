package org.jn.core.java.student.Anas.Sirelkhatim.RelationalOperator;

import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i = input.nextInt();
        int j = input.nextInt();
        
        System.out.println(i > j);
        System.out.println(i >= j);
        System.out.println(i < j);
        System.out.println(i <= j);
        System.out.println(i == j);
        System.out.println(i != j);
        
        input.close();
        

    }

}
