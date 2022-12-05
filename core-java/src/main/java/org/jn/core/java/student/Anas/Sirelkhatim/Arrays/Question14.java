package org.jn.core.java.student.Anas.Sirelkhatim.Arrays;

import java.util.Scanner;

public class Question14 {

    public static void main(String[] args) {
       
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        
        int greatest = arr[0];
        
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > greatest)
            greatest = arr[i];
            
            else
                continue;
        }
        input.close();
        System.out.println(greatest);
        

    }

}
