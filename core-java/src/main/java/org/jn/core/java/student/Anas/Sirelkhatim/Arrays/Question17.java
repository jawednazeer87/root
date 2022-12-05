package org.jn.core.java.student.Anas.Sirelkhatim.Arrays;
import java.util.*;

import org.apache.logging.log4j.core.util.ArrayUtils;
public class Question17 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random rand = new Random();
        
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = new int[20];
        
        for(int i = 0; i < arr1.length; i++)
        {
            arr1[i] = rand.nextInt(30); 
        }
        
        for(int i = 0; i < arr2.length; i++)
        {
            arr2[i] = rand.nextInt(30); 
        } 
        
        String dis = Arrays.toString(arr1);
        String diss = Arrays.toString(arr2);
        
        
        System.out.println(dis);
        System.out.println(diss);
        
        System.arraycopy(arr1, 0, arr3, 0, 10);  
        System.arraycopy(arr2, 0, arr3, 10, 10);  
        System.out.println(Arrays.toString(arr3));
        
       
        
        

    }

}
