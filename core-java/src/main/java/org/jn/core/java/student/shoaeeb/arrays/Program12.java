package org.jn.core.java.student.shoaeeb.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program12 {
	//pangram or not
	public static boolean checkIfPangram(String sentence) {
       
		int arr[] = new int[26];
		char characterArr []= sentence.toCharArray();
		for(int i=0; i<sentence.length(); i++)
		{
			arr[characterArr[i]-'a']++;
		}
		
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
			{
				return false;
			}
		}
		
		
       
       
       return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		String s= "leetcode";
		boolean pangram = checkIfPangram(sentence);
		System.out.println(pangram);
		
	}

}
