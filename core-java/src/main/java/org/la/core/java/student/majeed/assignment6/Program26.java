package org.la.core.java.student.majeed.assignment6;

public class Program26 {

	public static void main(String[] args) {
		/*
		void printStarFromRight(int n)
		print star pattern from right
		 */
		printStarFromRight(6);
	}
	
	static void printStarFromRight(int a) {
		int i,j;
        for ( i = 1; i <= a; i++) {
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