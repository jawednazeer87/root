package org.la.core.java.student.waleed.homework.methods.assignment6;

import java.util.Scanner;

public class TestVowelAnotherSolution {

	public static void main(String[] args) {
		
		
		Scanner cons = new Scanner(System.in);
		String sentence;
		System.out.print("Enter a string: ");
		sentence= cons.nextLine();
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
	
	 public static boolean isVowel(char letter) {
		 
		 
		 switch (letter)
		 {  
		 case 'A': break;  
		 case 'a': break;  
		 case 'e': break;  
		 case 'E': break;  
		 case 'I': break;  
		 case 'i': break;  
		 case 'u':  break;  
		 case 'O':  break;  
		 case 'o':  break;  
		 case 'U': break;
			 
		 default : return false;
		
		 }
		 return true;
	 }
	

}

		

	


