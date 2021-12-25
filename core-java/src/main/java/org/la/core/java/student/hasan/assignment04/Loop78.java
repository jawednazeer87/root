package org.la.core.java.student.hasan.assignment04;

public class Loop78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1; i<=5; i++)
	     {
	         for(int k=1; k<=i; k++)
	         {
	             System.out.print(" ");
	         } 
	         for(int j=1; j<=5-i+1; j++)
	         {
	             System.out.print("*");
	         } 
	         System.out.println();
	     }
	}

}
