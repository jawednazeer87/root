package org.jn.core.java.student.Anas.Sirelkhatim.Arrays;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {


        int[] arr = new int[10];
        int n = 0;
        int[] arr2 = new int[10];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        
        for(int i = 0; i < arr2.length; i++)
        {
            arr2[9 - n] = arr[i];
            n++;
        }
        input.close();
        
        for(int j = 0; j < arr2.length; j++)
        {
            System.out.println(arr2[j]);
        }
        

    }

}
