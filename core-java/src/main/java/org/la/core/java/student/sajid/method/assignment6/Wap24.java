package org.la.core.java.student.sajid.method.assignment6;

public class Wap24 {

	public static void main(String[] args) {
		// 24)	void printIncrStar(int n)
		//print star pattern
		
		int i=5;		
		printIncrStar(i);
	}
	
	static void printIncrStar(int a) {
		
		for(int i=1;i<=a;i++) {
			System.out.println(" ");
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
		}
	}

}
