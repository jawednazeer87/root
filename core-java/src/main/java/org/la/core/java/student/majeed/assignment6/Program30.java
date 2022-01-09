package org.la.core.java.student.majeed.assignment6;

public class Program30 {

	public static void main(String[] args) {
		/*
		void diamond(int n)
		print diamond
		 */
		printStarReverseRight(6);
	}
	
	static void printStarReverseRight(int a) {
		int i,j;
	       for (i = 0; i < a; i++) {
	            for (j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (j = 0; j < a - i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		}
	

}