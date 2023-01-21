package org.jn.core.java.student.anas.sirelkhatim.arrays;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.println(arr[i]);
            }
            else
                continue;
        }
        
        input.close();

    }

}
