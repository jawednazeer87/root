package org.la.core.java.student.tanseer.assignment4.loops;
import java.util.*;

public class Program42Fibonacci {

	public static void main(String[] args) {
		
		int count, num1 = 0, num2 = 1;
        System.out.println("How may numbers you want in the sequence:");
        
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
        int j=1;
        
//        Using for Loop
        
        for(;j<=count;j++) {
        	System.out.print(num1+" ");
        	int sumOfTwo = num1 + num2;
        	num1 = num2;
        	num2 = sumOfTwo;
        	
        }

	}
}