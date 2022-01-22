package org.la.core.java.student.sajid.method.assignment6;

public class Wap27 {

	public static void main(String[] args) {
		// 27)	void printStarReverseRight(int n)
		//print star in decreasing order from right
		
		int i=5;
		printStarReverseRight(i);
	}

		static void printStarReverseRight(int a) {
	
			char c = '*';
			
			for(int spc=a;spc>=1;spc--) {
				
			for(int i=a;i>spc;i--) {
				System.out.print(" ");
			}
			for(int j=1;j<=spc;j++) {
				System.out.print(c);
			}
				System.out.println("");

		}
	}
}
