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
		for(int i= a;i>=1;i--) {
			for(int j=i;j>=1;j--) {
			System.out.print("*");
			}
			System.out.println("");
		}
		}
	

}