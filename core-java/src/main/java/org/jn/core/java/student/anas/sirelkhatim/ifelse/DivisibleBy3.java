package org.jn.core.java.student.anas.sirelkhatim.ifelse;
import java.util.Scanner;

public class DivisibleBy3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        if (n%3 == 0)
            System.out.println("divisible by 3");
        else
            System.out.println("not divisible by 3");
        
        input.close();
            
        
        
        

    }

}
