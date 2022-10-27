package org.jn.core.java.student.Anas.Sirelkhatim.firstFiftyPrograms;

import java.util.Scanner;

public class Declare3Char {

    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
        
        char var1,var2,var3;
        
        var1 = input.next().charAt(0);
        var2 = input.next().charAt(0);
        var3 = input.next().charAt(0);
        
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        
        input.close();

    }

}
