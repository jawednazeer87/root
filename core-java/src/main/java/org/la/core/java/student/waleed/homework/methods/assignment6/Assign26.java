package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign26 {

	public static void main(String[] args) {
		
		
		

          int n = 7;
          printStarReverse(n);
	}
	 static void printStarReverse(int n) {
		for(int i=1; i<=n ;i++) {
			
			for(int spc=1 ; spc<i ; spc++) {
				System.out.print(" ");
			}
			for(int x=1 ; x<=n-i+1 ; x++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}


	}


