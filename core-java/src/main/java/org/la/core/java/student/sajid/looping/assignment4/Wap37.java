package org.la.core.java.student.sajid.looping.assignment4;

public class Wap37 {

	public static void main(String[] args) {
		int aplhbt = 26;
		
		int upprCase = 'A';	
		
		for(int i=1;i<=aplhbt;i++) {
			
			char c = (char)upprCase;
			
			if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			System.out.print(" "+c);			
			}
			upprCase++;
		}


	}

}
