package org.la.core.java.student.moshin.assignment6;

public class Assignment33 {
	
	public static void main(String[] args) {
		
		char a [] = {'A', 'B', 'c','a','t', '7', '9', 'x','1','Z'};
		
		char c[]=reverse(a);
		for(char i:c)
			System.out.print(i+" ");
		
	}
		
		static char[] reverse(char[] src) {
			
			char c [] =new char[src.length];
			int index =0;
			for (int i =src.length-1;i>=0; i--) {
			 
					c[index]=  src [i];
			 index++;
			 }
			return c;
				 
				}
		
			
		}