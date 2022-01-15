package org.la.core.java.student.majeed.assignment6;

public class Program25 {

	public static void main(String[] args) {
		/*
		void printIncrStar(int n)
		print star patter
		 */
		printIncrStar(6);
	}
	
	static void printIncrStar(int a) {
		for(int i= 1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		}
	

}