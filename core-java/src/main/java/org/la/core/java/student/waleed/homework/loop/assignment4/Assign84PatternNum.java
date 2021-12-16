package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign84PatternNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


	     int n = 3;
			
			for(int i=1; i<=n ;i++) {
				
				for(int spc=1 ; spc<=n-i ; spc++) {
					System.out.print( "  ");
				}
				for(int x=1 ; x<=i ; x++) {
					
					System.out.print(" "+x);
				}
				System.out.println(" ");
			}
		}

	}


