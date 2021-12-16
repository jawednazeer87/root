package org.la.core.java.student.sajid.looping.assignment4;

public class Wap34 {

	public static void main(String[] args) {
		int aplhbt = 26;
		
		int lowerCase = 'a';	
		
		for(int i=1;i<=aplhbt;i++) {
			
			char c = (char)lowerCase;
			
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u') {
			System.out.print(" "+c);			
			}
			lowerCase++;
		}

	}

}
