package org.jn.core.java.student.anas.sirelkhatim.arithmeticOperation;

import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double div;
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        div = (num1 / num2) * 100;
        
        System.out.println(div);
        
        input.close();

    }

}
