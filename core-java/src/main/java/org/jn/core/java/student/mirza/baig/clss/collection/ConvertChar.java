package org.jn.core.java.student.mirza.baig.clss.collection;

public class ConvertChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello, , Hi, How are you";
		
		char [] ch =new char[s.length()];
		
		for (int i=0; i<s.length(); i++) {
		ch[i]=s.charAt(i);
		}
		for (char c:ch) {
			System.out.print(c+" ");
		}
		
	}
		 
		
	}





//Convert String to char array
//String s = "Hello, Hi, How are you"