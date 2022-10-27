package org.jn.core.java.student.Anas.Sirelkhatim.firstFiftyPrograms;

import java.util.Scanner;

public class NewChar {

    public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);
        
        char var1;
        
        var1 = input.next().charAt(0);
        
        System.out.println(var1);
        
        var1 = input.next().charAt(0);
        
        System.out.println("New value " + var1);
        
        input.close();
        

    }

}
