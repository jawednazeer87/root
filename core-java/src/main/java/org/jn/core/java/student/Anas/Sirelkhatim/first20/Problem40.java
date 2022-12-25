package org.jn.core.java.student.Anas.Sirelkhatim.first20;

public class Problem40 {

    public static void main(String[] args) {
        
        int n = 3;
        int sum = n;
        
        while (n >= 2)
        {
            sum = sum * (n-1);
            n--;
        }
        System.out.println(sum);

    }

}
