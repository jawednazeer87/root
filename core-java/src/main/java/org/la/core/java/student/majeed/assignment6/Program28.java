package org.la.core.java.student.majeed.assignment6;

public class Program28 {

	public static void main(String[] args) {
		/*
		void printStarReverse(int n)
		print star pattern in decrease order
		 */
		printStarReverse(6);
	}
	
	static void printStarReverse(int a) {
		for(int i= a;i>=1;i--) {
			for(int j=i;j>=1;j--) {
			System.out.print("*");
			}
			System.out.println("");
		}
		}
	

}