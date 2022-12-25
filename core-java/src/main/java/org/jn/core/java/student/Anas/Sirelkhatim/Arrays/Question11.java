package org.jn.core.java.student.Anas.Sirelkhatim.Arrays;

import java.util.Scanner;

public class Question11 {

    public static void main(String[] args) {


        int[] arr = new int[10];
        int[] arr2 = new int[10];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        
        for(int i = 0; i < arr2.length; i++)
        {
            arr2[i] = arr[i];
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
        System.out.println("######################");
        
        for(int i = 0; i < arr2.length; i++)
        {
            System.out.println(arr2[i]);
        }
        
        input.close();

    }

}
