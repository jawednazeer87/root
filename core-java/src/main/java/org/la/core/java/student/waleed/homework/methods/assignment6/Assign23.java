package org.la.core.java.student.waleed.homework.methods.assignment6;

public class Assign23 {

	public static void main(String[] args) {
		
		int n =21;
		fibonocci( n);
		
		}
	
		static void fibonocci(int n) {
		int firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");
	   
	      // compute the next term
	      int nextTerm = firstTerm + secondTerm; 
	      firstTerm = secondTerm; 
	      secondTerm = nextTerm; 
	  
	    }
		
	}

	}


