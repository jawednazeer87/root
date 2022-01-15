package org.la.core.java.student.arfaz.assignment_6;


public class PrimeNumber
{
    public static void main(String[] args)
    {        
        for(int i = 1; i <= 500; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
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