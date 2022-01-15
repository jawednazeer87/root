package org.la.core.java.student.waleed.homework.methods.assignment6;

import java.util.Scanner;

public class Assign22 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number that you want print prime : ");
		int n = sc.nextInt();
		for(int i = 2; i <= n; i++)
        {
            if(isPrime(i))
            {
                System.out.println("Prime Number = "+i + " ");
            }
        }    
    }

    public static boolean isPrime(int number)
    {
        for(int i = 2; i < number; i++)
	{
	    if(number % i == 0)
            {
                return false;
            }
        }
        
        return true;
	}

}
