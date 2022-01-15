package org.la.core.java.student.waleed.homework.array.assignment5;

public class Wap49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		
		
		
		char a [] = {'A', 'B', 'c','a','t', '7', '9', 'x','1','Z'};
		
		char c[]=reverse(a);
		
	 char m ='A';
	 boolean flag =false;
	for(int i=0;i<c.length;i++ ) {
		if(c[i]==m) {
		flag= true;
			break;
		}
		} 
	if (flag)
			System.out.println(m+" is existed"); 
		else
			System.out.println(m+" is not founded "); 
	}
	
		
		static char[] reverse(char[] src) {
			
			char c [] =new char[src.length];
			int index =0;
			for (int i =src.length-1;i>=0; i--) {
			 
					c[index]=  src [i];
			 index++;
			 }
			
			for(char i:c)
				System.out.print(i+" "); 
			System.out.println(); 
			return c;
				}
	
	}
	


