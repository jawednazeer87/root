package org.la.core.java.student.waleed.homework.loop.assignment4;

public class Assign41FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int n = 5;
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
