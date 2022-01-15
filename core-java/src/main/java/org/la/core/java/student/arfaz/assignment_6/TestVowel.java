package org.la.core.java.student.arfaz.assignment_6;

import java.util.Scanner;

public class TestVowel
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String sentence;
        
        System.out.print("Enter a string: ");
        sentence = console.nextLine();
        
        int count = 0;
        
        for(int i = 0; i < sentence.length(); i++)
        {
            if(isVowel(sentence.charAt(i)))
            {
                count++;
            }
        }
        
        System.out.println("Number of vowels: " + count);    
    }

    public static boolean isVowel(char letter)
    {
        switch(letter)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }
    }
}