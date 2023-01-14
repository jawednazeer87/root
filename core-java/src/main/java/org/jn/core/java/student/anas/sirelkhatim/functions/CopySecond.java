package org.jn.core.java.student.anas.sirelkhatim.functions;

import java.util.Arrays;
import java.util.Random;

public class CopySecond {

    
    static int[] copy(int[] arr)
    {
        int [] newarr = new int[10];
        newarr = arr.clone();
        
        
        return newarr;
    }
    public static void main(String[] args) {
        
        Random num = new Random();
        int [] arr = new int[10];
        
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = num.nextInt(20);
        }
        arr = copy(arr);
        
        String print = Arrays.toString(arr);
        System.out.println(print);

    }

}
