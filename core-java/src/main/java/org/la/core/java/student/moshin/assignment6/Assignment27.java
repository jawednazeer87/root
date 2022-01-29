package org.la.core.java.student.moshin.assignment6;

public class Assignment27 {
	
	public static void main(String[] args) {


		int n = 7;
		  printStarReverseRight(n);
	   }
	  static  void printStarReverseRight(int n) {
		for(int i=1; i<=n ;i++) {
			
			for(int spc=1 ; spc<i ; spc++) {
				System.out.print(" ");
			}
			for(int x=1 ; x<=n-i+1 ; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	}


