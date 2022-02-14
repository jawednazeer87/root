package org.la.core.java.student.wang.assignment6;
import java.util.Scanner;

public class Assignment205 {
    /*
	205
Question 5
A non-negative integer is called a palindrome if it reads forward and backward in the same way.
For example, the numbers 5, 121, 3443, and 123454321 are palindromes. Write a method that takes as input a non-negative
integer and returns true if the number is a palindrome; otherwise, it returns false. Also write a program to test your method.

Show the answer.
     */
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
