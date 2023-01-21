package org.jn.core.java.student.anas.sirelkhatim.functions;

public class PrintNegative {
    
    
    static void print(int[] arr)
    {
        for (int i:arr)
        {
            if(i < 0)
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
