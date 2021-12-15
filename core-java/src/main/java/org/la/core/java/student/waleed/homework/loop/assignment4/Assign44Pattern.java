package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign44Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		
        int i = 7;
		
		for(int j=1; j<=i ;j++) {
			
			for(int spc=1 ; spc<=i-j ; spc++) {
				System.out.print(" ");
			}
			for(int x=1 ; x<=j ; x++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
