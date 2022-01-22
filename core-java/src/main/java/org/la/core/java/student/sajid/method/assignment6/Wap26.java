package org.la.core.java.student.sajid.method.assignment6;

public class Wap26 {

	public static void main(String[] args) {
		// 26)	void printStarReverse(int n)
		// print star pattern in decrease order 
		
		int i=5;
		printStarReverse(i);
	}

		static void printStarReverse(int a) {
	
			char c = '*';			
			
			for(int i=a;i>=1;i--) {
				for(int j=i;j>=1;j--) {
					System.out.print(c);
				}
				System.out.println("");
			}

	}

}
