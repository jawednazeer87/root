package org.jn.core.java.student.anas.sirelkhatim.arrays;

import java.util.Scanner;

public class Question13 {

    public static void main(String[] args)
    
    {
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++)
        {
           sum += arr[i];
        }
        System.out.println(sum);
    }

}
