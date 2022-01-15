package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign25 {

	public static void main(String[] args) {
		
		
		 int n = 7;
		 printStarFromRight( n)	;
	}
		static void printStarFromRight(int n) {
			
             for(int j=1; j<=n ;j++) {
				
				for(int spc=1 ; spc<=n-j ; spc++) {
					System.out.print(" ");
				}
				for(int x=1 ; x<=j ; x++) {
					System.out.print("*");
				}
				System.out.println("");
			}

				
			}

	}





