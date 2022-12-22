package org.jn.core.java.student.Anas.Sirelkhatim.Functions;

public class PrintOdd {

    static void print(int[] arr)
    {
        for (int i:arr)
        {
            if(i % 2 != 0)
                System.out.println(i);
            else
                continue;
            
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {2,4,-6,8,10,-3,-6,-9};
        print(arr);

    }

}