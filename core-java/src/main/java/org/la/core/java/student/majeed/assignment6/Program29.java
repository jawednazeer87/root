package org.la.core.java.student.majeed.assignment6;

public class Program29 {

	public static void main(String[] args) {
		/*
		void printStarReverseRight(int n)
		print star in decreasing order from right
		 */
		printStarReverseRight(6);
	}
	
	static void printStarReverseRight(int a) {
		int i,j;
        for (i = a; i >= 1; i--) {
            for (j = a; j > i; j--) {
                System.out.print(" ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
		}
	

}