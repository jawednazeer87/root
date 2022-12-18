package org.jn.core.java.student.Anas.Sirelkhatim.Functions;

import java.util.Random;

public class Sum {
    
    static int sum(int[] arr)
    {
        int sum = 0;
        
        for (int i:arr)
        {
            sum += i;
        }
        
        return sum;
        
    }

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        Random rand = new Random();
        
        for (int i = 0; i< arr.length;i++)
        {
            arr[i] = rand.nextInt(99);
        }
        
        int total = sum(arr);
        System.out.println(total);
        

    }

}
