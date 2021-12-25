package org.la.core.java.student.hasan.assignment04;

public class Loop72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum;
		  System.out.print("Perfect numbers are: ");
		  for (int n = 1; n <= 1000; n++) 
		  {
		   i = 1;
		   sum = 0;
		   while (i < n) {
		    if (n % i == 0) {
		     sum = sum + i;
		    }
		    i++;
		   }
		   if (sum == n) {
		    System.out.print(n + " ");
		   }
		  }
	}

}
