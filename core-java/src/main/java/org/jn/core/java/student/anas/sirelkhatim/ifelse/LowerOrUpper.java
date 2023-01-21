package org.jn.core.java.student.anas.sirelkhatim.ifelse;
import java.util.Scanner;

public class LowerOrUpper {
// 65 90
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    char marks = input.next().charAt(0);
    
    if (marks >= 'a' && marks <= 'z')
        System.out.println("Lower");
    else
        System.out.println("Upper");
        
    
    input.close();
        

    }

}
