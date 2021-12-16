package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign77StarDownLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		
             int n = 4;
		
		for(int i=1; i<=n ;i++) {
			
			
			for(int x=1 ; x<=n-i+1 ; x++) {
				System.out.print("*");
			}
				for(int spc=1 ; spc<i ; spc++) {
					System.out.print(" ");
				}
			
			System.out.println("");
		}
	}
}


	

	


