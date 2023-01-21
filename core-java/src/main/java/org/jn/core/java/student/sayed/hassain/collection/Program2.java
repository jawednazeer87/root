package org.jn.core.java.student.sayed.hassain.collection;

public class Program2 {
	//2.	Convert String to char array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first approach
		
		String s = "Hello, Hi, How are you";
		char ch[] = new char[s.length()];
		for(int i=0; i<s.length(); i++)
		{
			ch[i]=s.charAt(i);
		}
		
		//printing the char array
		for(char c: ch)
		{
			System.out.print(c+" ");
		}
		
		//using function toCharArray();
		
		char chArr[] = new char[s.length()];
		
		chArr = s.toCharArray();
		
		for(char c: chArr)
		{
			System.out.print(ch +" ");
		}
		
		
		
		
	}

}
