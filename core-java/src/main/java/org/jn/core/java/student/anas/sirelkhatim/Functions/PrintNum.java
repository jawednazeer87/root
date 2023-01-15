package org.jn.core.java.student.anas.sirelkhatim.functions;

import java.util.Scanner;

public class PrintNum {

    static void print(int n,int[] arr)
    {
        for (int i:arr)
        {
            if(i == n)
            {
                System.out.println(i);
                break;
            }
            else
            {
                System.out.println("number not found");
                break;
            }
            
                
            
            
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        int[] arr = {2,4,-6,8,10,-3,-6,-9};
        print(num,arr);
        input.close();

    }

}
