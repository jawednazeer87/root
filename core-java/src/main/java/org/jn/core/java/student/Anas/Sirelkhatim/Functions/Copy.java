package org.jn.core.java.student.Anas.Sirelkhatim.Functions;
import java.util.*;

public class Copy {

    static void copy(int[] arr1, int[] arr2)
    {
        int[] arr3 = new int[arr1.length + arr2.length];
        
        for(int i = 0;i < arr1.length; i++)
        {
            arr3[i] = arr1[i];
        }
        
        for(int j = arr1.length;j < arr3.length; j++)
        {
            int i = 10;
            arr3[j] = arr2[j-i];
        }
        
        String arr = Arrays.toString(arr3);
                System.out.println(arr);
       
   
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        Random r1 = new Random();
        
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        
        for (int i = 0 ; i < arr1.length ; i++)
        {
            arr1[i] = r1.nextInt(10);
        }
        
        for (int j = 0 ; j < arr2.length ; j++)
        {
            arr2[j] = r1.nextInt(10);
        }
        copy(arr1,arr2);
    }
}
