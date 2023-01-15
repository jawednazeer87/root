package org.jn.core.java.student.anas.sirelkhatim.datatype;import java.util.*;

public class sum2input {

    public static void main(String[] args) {
        
        int num1;
        int num2;
        int sum;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("what is the first number");
        
        num1 = sc.nextInt();
        
        System.out.println("What is the second number");
        
        num2 = sc.nextInt();
        
        sc.close();
        
        sum = num1 + num2;
        
        System.out.println("Sum of these numbers: "+sum);
    }

}
