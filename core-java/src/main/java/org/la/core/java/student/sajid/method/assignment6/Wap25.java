package org.la.core.java.student.sajid.method.assignment6;

public class Wap25 {

	public static void main(String[] args) {
		// 25)	void printStarFromRight(int n)
		//print star pattern from right

			int i=5;		
			printStarFromRight(i);
		}
	
	static void printStarFromRight(int a) {
		
		char c = '*';
		
		for(int i=1;i<=a;i++) {
			
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
			}
				for(int l=1;l<=i;l++) {
					System.out.print(c);
				}
				System.out.println("");
			}
	}
}
