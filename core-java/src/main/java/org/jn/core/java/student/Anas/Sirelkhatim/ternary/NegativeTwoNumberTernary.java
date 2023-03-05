package org.jn.core.java.student.Anas.Sirelkhatim.ternary;

import java.util.Scanner;

public class NegativeTwoNumberTernary {

    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
        
        int i = input.nextInt();
        int j = input .nextInt();
        
        int result_i;
        //int result_j;
        
        
        result_i = (i < 0) ? i  : (j<0) ? j : i;
        System.out.println(result_i);
        
        input.close();

    }

}
