package org.jn.core.java.student.Anas.Sirelkhatim.If_Else;

import java.util.Scanner;

public class GreatestAmong3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int i = input.nextInt();
        int j = input.nextInt();
        
        if(n > i && n > j)
            System.out.println(n);
        else if (i > n && i > j)
            System.out.println(i);
        else
            System.out.println(j);
        input.close();

    }

}
