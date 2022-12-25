package org.jn.core.java.student.Anas.Sirelkhatim.If_Else;

import java.util.Scanner;

public class GreatestThreeNumbers {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        
        
        if( i > j && i > k )
            System.out.println(i);
        
        if(j > i && j > k)
            System.out.println(j);
        
        if(k > i && k > j)
            System.out.println(j);


            
        
        input.close();

    }

}
