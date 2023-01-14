package org.jn.core.java.student.anas.sirelkhatim.functions;

import java.util.Random;

public class Average {

    static int average(int[] arr)
    {
        int sum = 0;
        
        for (int i:arr)
        {
            sum += i;
        }
        
        int average = sum / arr.length;
        return average;
        
    }

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        Random rand = new Random();
        
        for (int i = 0; i< arr.length;i++)
        {
            arr[i] = rand.nextInt(99);
        }
        
        int get_average = average(arr);
        System.out.println(get_average);
        

    }

}
