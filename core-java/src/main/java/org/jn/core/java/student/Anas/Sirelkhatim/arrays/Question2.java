package org.jn.core.java.student.anas.sirelkhatim.arrays;
import java.util.*;
public class Question2 {

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        
        for(int i = 0; i < arr.length; i++)
        {
           System.out.println(arr[i]);
        }
        input.close();
    }

}
