package org.la.core.java.student.arfaz.assignment_6;


import java.util.Scanner;

public class TestPalindrome
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
     
        int num;

        System.out.print("Enter a number: ");
        num = console.nextInt();
        
        if(isPalindrom(num))
        {
            System.out.println("Number is palindrom");
        }
        else
        {
            System.out.println("Number is not palindrom");
        }
    }


    public static boolean isPalindrom(int number)
    {
        int temp = number;
        int remainder;
        int reverse = 0;
        
        while(temp > 0)
	{
            remainder = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + remainder;
	}
        
        return reverse == number;
    }
}